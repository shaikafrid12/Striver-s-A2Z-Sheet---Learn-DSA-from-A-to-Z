import java.util.*;

public class OptimalApproach {
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

    private static int maxsubarray(int[] arr, int n) {
        int maxans = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0; i < n; i++) {
            currsum += arr[i];
            if (currsum > maxans)
                maxans = currsum;
            if (currsum < 0)
                currsum = 0;
        }
        return maxans;
    }
}
