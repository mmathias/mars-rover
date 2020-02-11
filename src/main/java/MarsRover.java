public class MarsRover {

    private int x;
    private int y;
    private DirectionTypes direction;
    private Plateau plateau;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public DirectionTypes getDirection() {
        return direction;
    }

    public void setDirection(DirectionTypes direction) {
        this.direction = direction;
    }

    public Plateau getPlateau() {
        return plateau;
    }

    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }

    public void runInstruction(char instruction) {
        switch (instruction) {
            case 'M': this.moveForward(); break;
            case 'L': this.setDirection(this.direction.previous()); break;
            case 'R': this.setDirection(this.direction.next()); break;
        }
    }

    private void moveForward() {
        switch (this.direction) {
            case N:
                this.setY((this.getY() + 1) > this.getPlateau().getLimitY() ? this.getY() : this.getY() + 1);
                break;
            case E:
                this.setX((this.getX() + 1) > this.getPlateau().getLimitX() ? this.getX() : this.getX() + 1);
                break;
            case S:
                this.setY((this.getY() - 1) < 0 ? this.getY() : this.getY() - 1);
                break;
            case W:
                this.setX((this.getX() - 1) < 0 ? this.getX() : this.getX() - 1);
                break;
        }
    }

    @Override
    public String toString() {
        return "MarsRover{" +
                "x=" + x +
                ", y=" + y +
                ", direction=" + direction +
                '}';
    }
}
