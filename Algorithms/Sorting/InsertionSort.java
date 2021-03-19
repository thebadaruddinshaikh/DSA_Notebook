//Insertion Sort

class Sort {
    public int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int key = arr[i];

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("THis is it");
        int[] test = { 54, 68, 92, 3, 565, 8, 7, 64, 0 };
        Sort lort = new Sort();
        lort.sort(test);
        for (int a : test)
            System.out.println(a);
    }
}