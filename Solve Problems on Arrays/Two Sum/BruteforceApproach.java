import java.util.*;

public class BruteforceApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(twoSumExists(arr, n, x));
        int res[] = twoSumIndices(arr, n, x);
        System.out.println("[" + res[0] + ", " + res[1] + "]");
        sc.close();
    }

    public static String twoSumExists(int arr[], int n, int target) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return "Yes";
                }
            }
        }
        return "No";
    }

    public static int[] twoSumIndices(int arr[], int n, int target) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
