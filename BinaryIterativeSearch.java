public class BinaryIterativeSearch implements Practice03Search {

    @Override
    public int search(int[] arr, int target) {
        int l = 0; // left index
        int r = arr.length - 1; // right index
        int m; // middle
        while (l <= r) {
            m = (l+r)/2; // calculating middle index
            if (arr[m] < target) { // if target is bigger than middle value we move left index to the right
                l = m+1;
            } else if (arr[m] > target) { // if target is smaller than middle value we move right index to the left
                r = m-1;
            } else { // if target is in the middle we return the middle index
                return m;
            }
        }
        // if left index is bigger than right that means target is not in array
        return -1;
    }
}