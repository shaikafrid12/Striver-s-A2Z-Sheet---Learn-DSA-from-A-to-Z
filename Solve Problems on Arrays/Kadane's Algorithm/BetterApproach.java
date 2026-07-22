import java.util.*;

public class BetterApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = maxsubarray(arr, n);
        System.out.println(x);
        sc.close();
    }

    private static int maxsubarray(int arr[], int n) {
        int maxans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                maxans = Math.max(maxans, sum);
            }
        }
        return maxans;
    }
}
