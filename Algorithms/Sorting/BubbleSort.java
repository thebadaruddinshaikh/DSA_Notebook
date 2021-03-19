class Sort {
    public int[] sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("THis is it");
        int[] test = { 54, 68, 92, 3, 565, 8, 7, 64, 0 };
        Sort lort = new Sort();
        lort.sort(test);
        for (int a : test)
            System.out.println(a);
    }
}