public class Problem1 {

    // Do not change signature (function name, parameter variable type and return type)
    public static int binarySearch(int[] data, int target) {
        int left = 0;
        int right = data.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (data[mid] == target) {
                return mid;
            } else if (data[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // TODO: answers "how would you prove your code is correct?". "ChatGPT says so" doesn't count as a good answer.

    // TODO: remove all the comment of "TODOs" and "Placeholder" once the homework is done. In other files too.

    // Incomplete currently
}
