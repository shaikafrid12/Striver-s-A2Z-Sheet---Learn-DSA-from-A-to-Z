import java.util.*;

public class BetterApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(appearOnce(arr, n));
        sc.close();
    }

    public static int appearOnce(int arr[], int n) {
        // int temp[] = new int[n + 1];
        // for (int i = 0; i < n; i++) {
        // temp[arr[i]]++;
        // }
        // for (int i = 1; i < n + 1; i++) {
        // if (temp[i] == 1) {
        // return i;
        // }
        // }
        // return -1;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }
}
