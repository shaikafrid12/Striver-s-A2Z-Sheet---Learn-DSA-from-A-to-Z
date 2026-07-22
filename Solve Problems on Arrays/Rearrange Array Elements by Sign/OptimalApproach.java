import java.util.*;

public class OptimalApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int nums[] = rearrange(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        sc.close();
    }

    private static int[] rearrange(int[] arr, int n) {
        int[] ans = new int[n];
        int posindex = 0;
        int negindex = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                ans[negindex] = arr[i];
                negindex += 2;
            } else {
                ans[posindex] = arr[i];
                posindex += 2;
            }
        }
        return ans;

    }
}
