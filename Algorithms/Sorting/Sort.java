public class Sort {

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int[] la = { 1, 11, 5, 8, 12, 4, 32, 90, 11, 765, 23 };
        ms.sort(la, 0, la.length - 1);
        for (int a : la)
            System.out.print(a + " ");
    }
    // int[] arr;

    // Sort(int[] a) {
    // this.arr = a;
    // }

    // public int[] insertionSort() {
    // for (int i = 1; i < arr.length; i++) {
    // int j = i - 1;
    // int key = arr[i];
    // while (key < arr[j] && j >= 0) {
    // arr[j + 1] = arr[j];
    // j--;
    // }
    // arr[j + 1] = key;
    // }
    // return arr;
    // }

    // public int[] bubbleSort() {
    // for (int i = 0; i < arr.length - 1; i++) {
    // for (int j = 0; j < arr.length - i - 1; j++) {
    // if (arr[j + 1] < arr[j]) {
    // int temp = arr[j];
    // arr[j] = arr[j + 1];
    // arr[j + 1] = temp;
    // }
    // }
    // }
    // return arr;
    // }
}
