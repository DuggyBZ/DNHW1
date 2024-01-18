public class Problem3 {

    // Do not change signature (function name, parameters, return type)
    public static long sumOfNonUnique(int[] data) {
        long sum = 0;
        boolean[] counted = new boolean[data.length];

        for (int i = 0; i < data.length; i++) {
            if (!counted[i]) {
                int count = 0;
                for (int j = 0; j < data.length; j++) {
                    if (data[i] == data[j]) {
                        count++;
                        if (j > i) {
                            counted[j] = true; // Mark duplicates found after i as counted
                        }
                    }
                }
                if (count > 1) {
                    sum += (long) data[i] * count; // Add the number times the count if it's not unique
                }
            }
        }

        return sum;
    }
}



    /*
    TODO: Bonus Points. Add your answer here.
     */