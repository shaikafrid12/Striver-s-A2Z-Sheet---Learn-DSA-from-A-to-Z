import java.util.*;

public class BetterApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(countsubarray(arr, n, k));
        sc.close();
    }

    public static int countsubarray(int arr[], int n, int target) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == target) {
                    count++;
                }
            }
        }
        return count;
    }
}
