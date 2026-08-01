import java.util.*;

public class Merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int nums1[] = new int[m + n];
        int nums2[] = new int[n];

        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }
        merge_arrays(nums1, nums2, m, n);

        for (int num : nums1) {
            System.out.print(num + " ");
        }
        sc.close();
    }

    public static void merge_arrays(int arr1[], int arr2[], int m, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k] = arr1[i];
                k--;
                i--;
            } else {
                arr1[k] = arr2[j];
                k--;
                j--;
            }
        }
        while (j >= 0) {
            arr1[k] = arr2[j];
            k--;
            j--;
        }

    }

}
