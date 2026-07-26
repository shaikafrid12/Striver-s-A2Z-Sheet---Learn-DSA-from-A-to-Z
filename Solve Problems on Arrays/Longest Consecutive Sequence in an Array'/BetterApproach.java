import java.util.*;

public class BetterApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = longestConsecutive(arr, n);
        System.out.println(x);
        sc.close();
    }

    public static int longestConsecutive(int arr[], int n) {
        if (n == 0)
            return 0;
        Arrays.sort(arr);
        int longest = 1;
        int cnt = 1;
        int lastSmaller = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] - 1 == lastSmaller) {
                cnt++;
                lastSmaller = arr[i];
            } else if (arr[i] != lastSmaller) {
                cnt = 1;
                lastSmaller = arr[i];
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }
}
