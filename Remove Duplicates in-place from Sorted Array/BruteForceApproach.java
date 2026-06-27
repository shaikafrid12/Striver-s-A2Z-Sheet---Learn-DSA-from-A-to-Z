import java.util.*;

public class BruteForceApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = removeDuplicates(arr, n);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }

    public static int removeDuplicates(int arr[], int n) {
        HashSet<Integer> set = new HashSet<>();
        int i = 0;
        for (int nums : arr) {
            if (!set.contains(nums)) {
                set.add(nums);
                arr[i] = nums;
                i++;
            }
        }
        return i;
    }
}
