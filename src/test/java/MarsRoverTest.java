import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {

    private MarsRover marsRover = new MarsRover();
    private Plateau plateau = new Plateau(1, 1);

    @Test
    public void it_RunInstructionsShouldRotate_WhenANorthFacingRoverStartingIn00() {
        marsRover.setX(0);
        marsRover.setY(0);
        marsRover.setPlateau(plateau);

        marsRover.setDirection(DirectionTypes.N);

        marsRover.runInstruction('L');
        assertEquals(DirectionTypes.W, marsRover.getDirection());

        marsRover.runInstruction('L');
        assertEquals(DirectionTypes.S, marsRover.getDirection());

        marsRover.runInstruction('L');
        assertEquals(DirectionTypes.E, marsRover.getDirection());

        marsRover.runInstruction('L');
        assertEquals(DirectionTypes.N, marsRover.getDirection());

        marsRover.runInstruction('R');
        assertEquals(DirectionTypes.E, marsRover.getDirection());

        marsRover.runInstruction('R');
        assertEquals(DirectionTypes.S, marsRover.getDirection());

        marsRover.runInstruction('R');
        assertEquals(DirectionTypes.W, marsRover.getDirection());

        marsRover.runInstruction('R');
        assertEquals(DirectionTypes.N, marsRover.getDirection());
    }

    @Test
    public void it_RunInstructions_ShouldMoveTo01_WhenARoverStartsIn00PointingNorth() {
        marsRover.setX(0);
        marsRover.setY(0);
        marsRover.setPlateau(plateau);

        marsRover.setDirection(DirectionTypes.N);

        marsRover.runInstruction('M');
        assertEquals(DirectionTypes.N, marsRover.getDirection());
        assertEquals(0, marsRover.getX());
        assertEquals(1, marsRover.getY());
    }

    @Test
    public void it_RunInstructions_ShouldMoveTo10_WhenARoverStartsIn00PointingEast() {
        marsRover.setX(0);
        marsRover.setY(0);
        marsRover.setPlateau(plateau);

        marsRover.setDirection(DirectionTypes.E);

        marsRover.runInstruction('M');
        assertEquals(DirectionTypes.E, marsRover.getDirection());
        assertEquals(1, marsRover.getX());
        assertEquals(0, marsRover.getY());
    }

    @Test
    public void it_RunInstructions_ShouldMoveTo10_WhenARoverStartsIn11PointingSouth() {
        marsRover.setX(1);
        marsRover.setY(1);
        marsRover.setPlateau(plateau);

        marsRover.setDirection(DirectionTypes.S);

        marsRover.runInstruction('M');
        assertEquals(DirectionTypes.S, marsRover.getDirection());
        assertEquals(1, marsRover.getX());
        assertEquals(0, marsRover.getY());
    }

    @Test
    public void it_RunInstructions_ShouldMoveTo00_WhenARoverStartsIn10PointingWest() {
        marsRover.setX(1);
        marsRover.setY(0);
        marsRover.setPlateau(plateau);

        marsRover.setDirection(DirectionTypes.W);

        marsRover.runInstruction('M');
        assertEquals(DirectionTypes.W, marsRover.getDirection());
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
    }

    @Test
    public void itShouldNotMoveEastIfHittingTheWall() {
        marsRover.setX(1);
        marsRover.setY(0);
        marsRover.setPlateau(plateau);

        marsRover.setDirection(DirectionTypes.E);

        marsRover.runInstruction('M');
        assertEquals(DirectionTypes.E, marsRover.getDirection());
        assertEquals(1, marsRover.getX());
        assertEquals(0, marsRover.getY());
    }

    @Test
    public void itShouldNotMoveSouthIfHittingTheWall() {
        marsRover.setX(1);
        marsRover.setY(0);
        marsRover.setPlateau(plateau);

        marsRover.setDirection(DirectionTypes.S);

        marsRover.runInstruction('M');
        assertEquals(DirectionTypes.S, marsRover.getDirection());
        assertEquals(1, marsRover.getX());
        assertEquals(0, marsRover.getY());
    }

    @Test
    public void itShouldNotMoveNorthIfHittingTheWall() {
        marsRover.setX(0);
        marsRover.setY(1);
        marsRover.setPlateau(plateau);

        marsRover.setDirection(DirectionTypes.N);

        marsRover.runInstruction('M');
        assertEquals(DirectionTypes.N, marsRover.getDirection());
        assertEquals(0, marsRover.getX());
        assertEquals(1, marsRover.getY());
    }

    @Test
    public void itShouldNotMoveWestIfHittingTheWall() {
        marsRover.setX(0);
        marsRover.setY(1);
        marsRover.setPlateau(plateau);

        marsRover.setDirection(DirectionTypes.W);

        marsRover.runInstruction('M');
        assertEquals(DirectionTypes.W, marsRover.getDirection());
        assertEquals(0, marsRover.getX());
        assertEquals(1, marsRover.getY());
    }
}
