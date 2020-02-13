public class SelectionSort implements Practice03Sort {

    @Override
    public void sort(int[] a) {
        int index; // index of the lowest item
        int temp; // variable for swapping
        for (int i=0; i<a.length-1; i++) { // iterating through the array and choosing which indexes to replace
            index = i;
            for (int j=i+1; j<a.length; j++) {
                if (a[j] < a[index]) { // updating the smallest value index
                    index = j;
                }
            } // swapping
            temp = a[i];
            a[i] = a[index];
            a[index] = temp;
        }
    }
}