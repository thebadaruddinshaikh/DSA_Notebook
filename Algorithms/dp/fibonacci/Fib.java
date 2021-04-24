package dp.fibonacci;

public class Fib {
    int[] arr = new int[20];

    public int memo(int n) {
        if (n <= 1)
            return n;
        if (arr[n] != 0)
            return arr[n];
        else {
            arr[n] = memo(n - 1) + memo(n - 2);
            return arr[n];
        }
    }
}