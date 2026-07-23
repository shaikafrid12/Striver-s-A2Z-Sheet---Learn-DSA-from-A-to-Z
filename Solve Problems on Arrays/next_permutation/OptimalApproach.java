import java.util.*;

public class OptimalApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        nextpermutation(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();
    }

    private static void nextpermutation(int[] arr, int n) {
        // Find the largest index k such that arr[k] < arr[k + 1]
        // If no such index exists, the permutation is the last permutation
        int k = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                k = i;
                break;
            }
        }

        // If no such index exists, the permutation is the last permutation
        if (k == -1) {
            // Reverse the array to get the first permutation
            reverse(arr, 0, n - 1);
            return;
        }

        // Find the largest index l greater than k such that arr[k] < arr[l]
        int l = -1;
        for (int i = n - 1; i > k; i--) {
            if (arr[k] < arr[i]) {
                l = i;
                break;
            }
        }

        // Swap the value of arr[k] with that of arr[l]
        swap(arr, k, l);

        // Reverse the sequence from arr[k + 1] up to and including the final element
        reverse(arr, k + 1, n - 1);
    }

    // Utility function to reverse the array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    // Utility function to swap two elements
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
