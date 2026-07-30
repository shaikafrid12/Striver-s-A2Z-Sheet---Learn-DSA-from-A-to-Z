import java.util.*;

public class OptimalApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(countReversePairs(arr, n));
        sc.close();
    }

    public static int countReversePairs(int[] arr, int n) {
        return mergeSort(arr, 0, n - 1);
    }

    public static int mergeSort(int[] arr, int low, int high) {
        if (low >= high)
            return 0;

        int mid = low + (high - low) / 2;

        int cnt = 0;
        cnt += mergeSort(arr, low, mid);
        cnt += mergeSort(arr, mid + 1, high);
        cnt += countPairs(arr, low, mid, high);
        merge(arr, low, mid, high);

        return cnt;
    }

    public static int countPairs(int[] arr, int low, int mid, int high) {
        int cnt = 0;
        int j = mid + 1;

        for (int i = low; i <= mid; i++) {
            while (j <= high && arr[i] > 2L * arr[j]) {
                j++;
            }
            cnt += (j - (mid + 1));
        }

        return cnt;
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left++]);
            } else {
                temp.add(arr[right++]);
            }
        }

        while (left <= mid) {
            temp.add(arr[left++]);
        }

        while (right <= high) {
            temp.add(arr[right++]);
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}