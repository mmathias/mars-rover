public class MarsRoverService {
    public String runInput(String input) {
        String[] lines = input.split("\n");

        // first current rover position
        String[] firstLine = lines[0].split(" ");
        MarsRover firstMarsRover = runInstructions(
                lines[1],
                lines[2],
                Integer.parseInt(firstLine[0]),
                Integer.parseInt(firstLine[1]));

        // second current rover position
        MarsRover secondMarsRover = runInstructions(lines[3], lines[4], Integer.parseInt(firstLine[0]), Integer.parseInt(firstLine[1]));

        return firstMarsRover + "\n" + secondMarsRover;
    }

    private MarsRover runInstructions(String currentStateStr, String commandsStr, int limitX, int limitY) {
        Plateau plateau = new Plateau(limitX, limitY);
        String[] currentState = currentStateStr.split(" ");

        MarsRover marsRover = new MarsRover(currentState[0], currentState[1], plateau, currentState[2]);

        // movements
        String[] commands = commandsStr.split("");
        for (String command : commands) {
            marsRover.runInstruction(command.charAt(0));
        }

        return marsRover;
    }
}
