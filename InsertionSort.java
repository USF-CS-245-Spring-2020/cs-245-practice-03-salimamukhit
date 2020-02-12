public class InsertionSort implements Practice03Sort {

    @Override
    public void sort(int[] a) {
        for (int i = 1; i < a.length; ++i) { 
            int temp = a[i]; 
            int j = i - 1; 
            while (j >= 0 && a[j] > temp) { 
                a[j + 1] = a[j]; 
                j = j - 1; 
            } 
            a[j + 1] = temp; 
        } 
    }
    
}