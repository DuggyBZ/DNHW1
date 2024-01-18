import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem2Test {

    @Test
    //Asked an ai to make some test cases, to guarantee correctness in checks.
    //The method checks if a sorting method arranges numbers from smallest to largest correctly.
    public void testBubbleSort() {
        int[][] inputs = {
                {2, 1, 0},
                {4, 3, 2, 1},
                {2, 3, 4, 5},
                {},
                {9},
        };
        int[][] expects = {
                {0, 1, 2},
                {1, 2, 3, 4},
                {2, 3, 4, 5},
                {},
                {9},
        };


        assertEquals(inputs.length, expects.length);

        for (int i = 0; i < inputs.length; i++) {
            // Call to bubble sort function
            Problem2.bubbleSort(inputs[i]);
            assertArrayEquals(expects[i], inputs[i]);
        }
    }
}

