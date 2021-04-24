// package dp.multistage;

class MultiStage {

    public static void main(String[] arg) {
        int[] cost = new int[13], d = new int[13], path = new int[13];
        int n = 12;
        cost[n] = 0;
        int[][] adjmatrix = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 9, 7, 3, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 4, 2, 1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 2, 7, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 11, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 11, 8, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 5, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 3, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 6, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, };

        for (int i = n - 1; i >= 1; i--) {
            int min = Integer.MAX_VALUE;
            for (int k = i + 1; k <= n; k++) {
                // System.out.println(i + " " + k);
                if (adjmatrix[i][k] != 0 && min > cost[k] + adjmatrix[i][k]) {
                    min = cost[k] + adjmatrix[i][k];
                    d[i] = k;
                }

            }
            cost[i] = min;
        }
        int l = 1;
        System.out.print("The Path to be Followed:: ");
        System.out.print(l + " ");
        while (l != n) {
            System.out.print(d[l] + " ");
            l = d[l];
        }
        System.out.println(" ");
        System.out.println("The Cost of the Path: " + cost[1]);
    }
}