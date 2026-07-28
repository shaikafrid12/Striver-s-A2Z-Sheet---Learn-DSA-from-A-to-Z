import java.util.*;

public class BruteforceApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        setzero(mat, n, m);
        System.out.println("The matrix after set zero is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static void setzero(int[][] mat, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    for (int col = 0; col < m; col++) {
                        if (mat[i][col] != 0) {
                            mat[i][col] = -999999;
                        }
                    }
                    for (int row = 0; row < n; row++) {
                        if (mat[row][j] != 0) {
                            mat[row][j] = -999999;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == -999999) {
                    mat[i][j] = 0;
                }
            }
        }
    }
}
