import java.util.*;

public class optimalMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Method 1 (Summation): " + FindMissing(arr, n));
        System.out.println("Method 2 (XOR): " + FindMissingXOR(arr, n));
        sc.close();
    }

    public static int FindMissing(int arr[], int n) {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        long totalSum = ((long) (n + 1) * (n + 2)) / 2;
        return (int) (totalSum - sum);
    }

    public static int FindMissingXOR(int arr[], int n) {
        int xor1 = 0;
        for (int i = 1; i <= n + 1; i++) {
            xor1 ^= i;
        }
        int xor2 = 0;
        for (int i = 0; i < n; i++) {
            xor2 ^= arr[i];
        }
        return xor1 ^ xor2;
    }
}
