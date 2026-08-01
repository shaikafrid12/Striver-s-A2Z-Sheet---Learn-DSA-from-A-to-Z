import java.util.*;

public class OptimalApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result[] = findMissingAndRepeating(arr, n);
        System.out.println(Arrays.toString(result));
        sc.close();
    }

    public static int[] findMissingAndRepeating(int[] nums, int n) {
        // Find Sn and S2n
        long Sn = ((long) n * (n + 1)) / 2;
        long S2n = ((long) n * (n + 1) * (2 * n + 1)) / 6;

        // Find actual sum and sum of squares
        long S = 0, S2 = 0;
        for (int i = 0; i < n; i++) {
            S += nums[i];
            S2 += (long) nums[i] * nums[i];
        }

        // S - Sn = X - Y
        long val1 = S - Sn;

        // S2 - S2n = X^2 - Y^2
        long val2 = S2 - S2n;

        // X + Y = (X^2 - Y^2) / (X - Y)
        long val3 = val2 / val1;

        // X = ((X - Y) + (X + Y)) / 2
        long repeating = (val1 + val3) / 2;
        
        // Y = X - (X - Y)
        long missing = repeating - val1;

        return new int[] { (int) repeating, (int) missing };
    }
}
