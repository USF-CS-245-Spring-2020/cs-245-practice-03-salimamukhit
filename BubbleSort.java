public class BubbleSort implements Practice03Sort {

    @Override
    public void sort(int[] a) {
        // temporary value we need for swapping
        int temp;
        // iterating through the whole array
        for (int i = 0; i < a.length - 1; i++) {
            // iterating through unsorted variables
            for (int j=1; j < a.length-i; j++) {
                // the case in which a bigger variable is before a smaller one
                if (a[j-1] > a[j]) {
                    // swapping them
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}