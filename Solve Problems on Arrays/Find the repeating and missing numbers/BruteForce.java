import java.util.*;

public class BruteForce {
    public static int[] findMissingAndRepeating(int[] nums, int n) {
        int missingno = -1, repeating = -1;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == i) {
                    cnt++;
                }
            }
            if (cnt == 2) {
                repeating = i;
            } else if (cnt == 0) {
                missingno = i;
            }
        }
        return new int[] { repeating, missingno };
    }

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
}
