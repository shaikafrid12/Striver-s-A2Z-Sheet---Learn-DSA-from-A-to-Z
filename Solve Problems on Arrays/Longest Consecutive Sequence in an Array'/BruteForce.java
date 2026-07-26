import java.util.*;

public class BruteForce {
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
        int longest = 1;
        for (int i = 0; i < n; i++) {
            int count = 1;
            int current = arr[i];

            while (linearSearch(arr, current + 1)) {
                current++;
                count++;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    private static boolean linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
