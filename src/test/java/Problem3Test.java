/*
 * DO NOT MAKE ANY CHANGES UNLESS SPECIFIED OTHERWISE
 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Problem3Test {

    // Okay to change the content of this function
    // DO NOT REMOVE OR CHANGE the signature
    @Test
    //Asked an ai to make some test cases, to guarantee correctness in checks. I wrote the discription of what each test case is, to prove i understand.
    public void testSumOfNonUnique() {
        assertEquals(0, Problem3.sumOfNonUnique(new int[]{})); // test with an Empty array
        assertEquals(0, Problem3.sumOfNonUnique(new int[]{1})); // This test has a Single element
        assertEquals(0, Problem3.sumOfNonUnique(new int[]{1, 2, 3})); // No duplicates here
        assertEquals(4, Problem3.sumOfNonUnique(new int[]{2, 2})); // All elements are the same
        assertEquals(4, Problem3.sumOfNonUnique(new int[]{1, 2, 2, 5})); //some are dups
        assertEquals(16, Problem3.sumOfNonUnique(new int[]{2, 4, 2, 1, 4, 4})); // multiple instances of dups
    }
    @Test
    public void largeArrayTest() {
        final int aLargeNumber = 100000;
        int[] input = new int[aLargeNumber];

        for (int i = 0; i < input.length; i++) {
            input[i] = i - aLargeNumber / 2;    // does this array have any non-unique number in it? (Not that i can see, NO)
        }

        final int expect = 0;   // why 0? (This makes sense, because since we established that the array does not have any non-unique numbers, we can expect the total of duplicates to be 0!

        long startTime = System.nanoTime();

        long actual = Problem3.sumOfNonUnique(input);

        long endTime = System.nanoTime();
        long durationInNano = endTime - startTime;

        assertEquals(expect, actual);

        System.out.printf("time: %f seconds", (double) durationInNano / 1e9);

        // this test takes a bit of time to finish, ain't it?
        // try a better design in your code so this test finishes faster
        // TODO:
        //Throughout working, i encountered varying times, my highest was 10 seconds, and my lowest is what it is at, with 7 seconds. EDIT: I got it down to udner 1 second!
    }
}