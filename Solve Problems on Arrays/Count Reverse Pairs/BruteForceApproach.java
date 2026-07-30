import java.util.*;

public class BruteForceApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = countreversepairs(arr, n);
        System.out.println(x);
        sc.close();

    }

    public static int countreversepairs(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > 2 * arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
