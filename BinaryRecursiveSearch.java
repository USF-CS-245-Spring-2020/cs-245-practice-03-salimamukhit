public class BinaryRecursiveSearch implements Practice03Search {

    @Override
    public int search(int[] arr, int target) {
        // returns binary function which allows more parameters
        return this.binary(arr, 0, arr.length-1, target);
    }

    int binary(int[] arr, int start, int end, int target) {
        if (end >= start) {
            //calculating the middle index
            int mid = (end+start)/2;
            // case where target is found right away
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                // case where target is smaller than middle value, we move ending index to the left
                return binary(arr, start, mid - 1, target);
            } else if (arr[mid] < target) {
                // case where target is bigger than middle value, we move starting index to the right
                return binary(arr, mid + 1, end, target);
            }
        }
        // if starting index is bigger than ending one, it means the whole array was searched but no target was found
        return -1;
    }
}