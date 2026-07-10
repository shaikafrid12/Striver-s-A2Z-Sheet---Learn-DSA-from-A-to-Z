import java.util.*;

public class BetterApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(FindMissing(arr, n));
        sc.close();

    }

    public static int FindMissing(int arr[], int n) {
        int temp[] = new int[n + 2];
        for (int i = 0; i < n; i++) {
            temp[arr[i]]++;
        }
        for (int i = 1; i <= n + 1; i++) {
            if (temp[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
