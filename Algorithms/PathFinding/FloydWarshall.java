public class FloydWarshall {
    public static void main(String[] args) {

        final int INF = 99999;
        int[][] adjMatrix = { { 0, INF, 2, 7 }, { INF, 0, 20, INF }, { INF, 30, 0, 1 }, { 12, 2, INF, 0 } };

        // tabulation
        // first for loop to iterate
        for (int k = 0; k < adjMatrix.length; k++) {
            // Pick all vertices as source one by one
            for (int i = 0; i < adjMatrix.length; i++) {
                // Pick all vertices as destination for the
                // above picked source
                for (int j = 0; j < adjMatrix.length; j++) {
                    // If vertex k is on the shortest path from
                    // i to j, then update the value of adjMatrix[i][j]
                    if (adjMatrix[i][k] + adjMatrix[k][j] < adjMatrix[i][j])
                        adjMatrix[i][j] = adjMatrix[i][k] + adjMatrix[k][j];
                }
            }
        }

        for (int[] a : adjMatrix) {
            for (int b : a)
                if (b == INF)
                    System.out.print("INF");
                else
                    System.out.print(b + " ");
            System.out.println("");
        }
    }
}