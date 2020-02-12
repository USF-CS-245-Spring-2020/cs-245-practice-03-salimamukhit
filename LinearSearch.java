public class LinearSearch implements Practice03Search {

    @Override
    public int search(int[] arr, int target) {
        // iterating through the array
        for (int i=0; i<arr.length; i++) {
            // if any item is equal to target, return the index
            if (arr[i] == target) {
                return i;
            }
        }
        // we iterated through the array but did not return anything, target is not in array
        return -1;
    }
    
}