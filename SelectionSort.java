public class SelectionSort implements Practice03Sort {

    @Override
    public void sort(int[] a) {
        int index;
        int temp;
        for (int i=0; i<a.length-1; i++) {
            index = i;
            for (int j=i+1; j<a.length; j++) {
                if (a[j] < a[index]) {
                    index = j;
                }
            }
            temp = a[i];
            a[i] = a[index];
            a[index] = temp;
        }
    }
    
}