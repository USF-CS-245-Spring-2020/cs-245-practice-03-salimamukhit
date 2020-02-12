public class BinaryRecursiveSearch implements Practice03Search {

    @Override
    public int search(int[] arr, int target) {
        return this.binary(arr, 0, arr.length-1, target);
    }

    int binary(int[] arr, int start, int end, int target) {
        if (end >= start) {
            int mid = (end - start) + start / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                return binary(arr, start, mid - 1, target);
            } else if (arr[mid] > target) {
                return binary(arr, mid + 1, end, target);
            }
        }
        return -1;
    }
}