import java.util.*;

public class OptimalApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        String s = sc.next();
        rotate(arr, k, s);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    public static void rotate(int[] arr, int k, String s) {
        int n = arr.length;
        k = k % n;
        if (s.equals("right")) {
            reverse(arr, 0, n - 1);
            reverse(arr, 0, k - 1);
            reverse(arr, k, n - 1);
        } else {
            reverse(arr, 0, k - 1);
            reverse(arr, k, n - 1);
            reverse(arr, 0, n - 1);
        }
    }

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
