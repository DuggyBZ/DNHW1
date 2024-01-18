public class Problem3 {

    // Do not change signature (function name, parameters, return type)
    public static long sumOfNonUnique(int[] data) {
        long sum = 0;
        boolean[] tallied = new boolean[data.length];

        for (int i = 0; i < data.length; i++) {
            if (tallied[i]) {
                continue;
            }
            //After adding this to mark current elements, my testcase time went down from 7 seconds to under 1 second
            int occurrence = 1;
            tallied[i] = true;

            for (int j = i + 1; j < data.length; j++) {
                if (data[i] == data[j]) {
                    occurrence++;
                    tallied[j] = true;
                }
            }

            if (occurrence > 1) {
                sum += (long) data[i] * occurrence;
            }
        }
        return sum;
    }
}


    /*
    answer to the todo:
     // Something that i could do to improve my code would be to maybe use hashmap for better calculation in a run. I think my variable names are solid, but always could be better. SO Maintainence wise, I think I did a good job (although i could organize it better in problem 4)
     */