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
        System.out.print(countsubarray(arr, n, k));
        sc.close();
    }

    public static int countsubarray(int arr[], int n, int k) {
        HashMap<Integer, Integer> prefixsummap = new HashMap<>();
        int currentsum = 0;
        int count = 0;
        prefixsummap.put(0, 1);
        for (int i = 0; i < n; i++) {
            currentsum += arr[i];
            if (prefixsummap.containsKey(currentsum - k)) {
                count += prefixsummap.get(currentsum - k);
            }
            prefixsummap.put(currentsum, prefixsummap.getOrDefault(currentsum, 0) + 1);
        }
        return count;
    }
}
