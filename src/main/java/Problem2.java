public class Problem2 {

    // Do not change signature (function name, parameters, return type)
    public static void bubbleSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temporary = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temporary;
                }

            }
        }
    }
    //Answer to the todo:
    // Well since the whole thing is based off of n-1, then I believe it would be (N-1)^2


}
