import java.util.*;

public class OptimalApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = countinversion(arr, n);
        System.out.println(x);
        sc.close();
    }

    public static int countinversion(int[] arr, int n) {
        return mergeSort(arr, 0, n - 1);
    }

    public static int mergeSort(int[] arr, int lo, int hi) {
        if (lo >= hi) {
            return 0;
        }
        int mid = (lo + hi) / 2;
        int left = mergeSort(arr, lo, mid);
        int right = mergeSort(arr, mid + 1, hi);
        int merge = merge(arr, lo, mid, hi);
        return left + right + merge;
    }

    public static int merge(int[] arr, int lo, int mid, int hi) {
        int cnt = 0;
        int[] temp = new int[hi - lo + 1];
        int i = lo;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= hi) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                cnt += mid - i + 1;
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= hi) {
            temp[k++] = arr[j++];
        }
        for (int l = 0; l < temp.length; l++) {
            arr[lo + l] = temp[l];
        }
        return cnt;
    }
}
