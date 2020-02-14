import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverServiceTest {

    private MarsRoverService marsRoverService = new MarsRoverService();

    @Test
    public void it_runInstructions() {
        String input = "5 5\n" +
            "1 2 N\n" +
            "LMLMLMLMM\n" +
            "3 3 E\n" +
            "MMRMMRMRRM";

        String output = marsRoverService.runInput(input);

        assertEquals("1 3 N\n5 1 E", output);
    }

    @Test
    public void it_runInstructions1() {
        String input = "5 5\n" +
                "1 2 N\n" +
                "LMLMLMLMMRMRMLM\n" +
                "3 3 E\n" +
                "MMRMMRMRRM";

        String output = marsRoverService.runInput(input);

        assertEquals("3 2 E\n5 1 E", output);
    }
}
