import java.util.*;

public class BruteForceApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        String dir = sc.next();
        sc.close();
        rotateArray(arr, k, dir);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void rotateArray(int[] arr, int k, String dir) {
        int n = arr.length;
        k = k % n;
        if (k == 0) {
            return;
        }

        if (dir.equals("right")) {
            int[] temp = Arrays.copyOfRange(arr, n - k, n);

            for (int i = n - k - 1; i >= 0; i--) {
                arr[i + k] = arr[i];
            }

            for (int i = 0; i < k; i++) {
                arr[i] = temp[i];
            }
        } else {
            int[] temp = Arrays.copyOfRange(arr, 0, k);

            for (int i = k; i < n; i++) {
                arr[i - k] = arr[i];
            }

            for (int i = 0; i < k; i++) {
                arr[n - k + i] = temp[i];
            }
        }
    }
}
