public class MarsRoverService {
    public String runInput(String input) {
        String[] lines = input.split("\n");

        // first current rover position
        String[] firstLine = lines[0].split(" ");
        MarsRover firstMarsRover = runInstructions(lines[1], lines[2], Integer.parseInt(firstLine[0]), Integer.parseInt(firstLine[1]));

        // second current rover position
        MarsRover secondMarsRover = runInstructions(lines[3], lines[4], Integer.parseInt(firstLine[0]), Integer.parseInt(firstLine[1]));

        return
            firstMarsRover.getX() + " " + firstMarsRover.getY() + " " + firstMarsRover.getDirection() + "\n" +
            secondMarsRover.getX() + " " + secondMarsRover.getY() + " " + secondMarsRover.getDirection();
    }

    private MarsRover runInstructions(String currentStateStr, String commandsStr, int limitX, int limitY) {
        Plateau plateau = new Plateau(limitX, limitY);
        String[] currentState = currentStateStr.split(" ");

        MarsRover marsRover = createMarsRover(currentState, plateau);

        // movements
        String[] commands = commandsStr.split("");
        for (String command : commands) {
            marsRover.runInstruction(command.charAt(0));
        }

        return marsRover;
    }

    private MarsRover createMarsRover(String[] currentState, Plateau plateau) {
        MarsRover marsRover = new MarsRover();
        marsRover.setX(Integer.parseInt(currentState[0]));
        marsRover.setY(Integer.parseInt(currentState[1]));
        marsRover.setPlateau(plateau);
        marsRover.setDirection(DirectionTypes.valueOf(currentState[2]));

        return marsRover;
    }
}
