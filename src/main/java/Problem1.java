public class Problem1 {

    // Do not change signature (function name, parameter variable type and return type)
    public static int binarySearch(int[] data, int target) {
        int first = 0;
        int last = data.length - 1;

        while (first <= last) {
            int middle = (first + last) / 2;

            if (data[middle] == target) {
                return middle;
            }
            if (data[middle] < target) {
                first = middle + 1;
            } else {
                last = middle - 1;
            }
        }

        return -1;
    }

    // TODO:
    //  My binary search code looks for a number in a list by repeatedly splitting the list in half until it finds the number (or it runs out of values to check.

}
