public class BinaryIterativeSearch implements Practice03Search {

    @Override
    public int search(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        int m;
        while (l <= r) {
            m = (l+r)/2;
            if (arr[m] < target) {
                l = m+1;
            } else if (arr[m] > target) {
                r = m-1;
            } else {
                return m;
            }
        }
        return -1;
    }
}