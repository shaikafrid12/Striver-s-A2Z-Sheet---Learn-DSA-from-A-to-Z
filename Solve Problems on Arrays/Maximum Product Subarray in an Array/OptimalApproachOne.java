import java.util.*;

public class OptimalApproachOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = productsubarray(arr, n);
        System.out.println(x);
        sc.close();

    }

    public static int productsubarray(int arr[], int n) {
        int pre = 1, suf = 1;
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (pre == 0)
                pre = 1;
            if (suf == 0)
                suf = 1;

            pre = pre * arr[i];
            suf = suf * arr[n - 1 - i];

            res = Math.max(res, Math.max(suf, pre));
        }
        return res;
    }
}
