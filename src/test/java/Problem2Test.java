import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem2Test {

    @Test
    public void testBubbleSort() {
        int[][] inputs = {
                {3, 2, 1},
                {5, 4, 3, 2, 1},  // A reverse-sorted array
                {1, 2, 3, 4, 5},  // An already sorted array
                {},               // An empty array
                {7},              // A single-element array
                // Add more test cases if necessary
        };
        int[][] expects = {
                {1, 2, 3},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {},
                {7},
                // Corresponding expected results for additional test cases
        };

        // Check if inputs and expects have the same number of arrays
        assertEquals("Number of test cases in inputs and expects should match", inputs.length, expects.length);

        for (int i = 0; i < inputs.length; i++) {
            // Call to your bubble sort function
            Problem2.bubbleSort(inputs[i]);

            // Check whether the actual result matches the expected result
            assertArrayEquals("Mismatch in sorted array for test case " + i, expects[i], inputs[i]);
        }
    }
}

