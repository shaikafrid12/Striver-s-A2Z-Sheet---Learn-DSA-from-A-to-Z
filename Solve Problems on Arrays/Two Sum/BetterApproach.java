import java.util.*;

public class BetterApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(twoSumExists(arr, n, x));
        int res[] = twoSumIndices(arr, n, x);
        System.out.println("[" + res[0] + ", " + res[1] + "]");
        sc.close();
    }

    public static String twoSumExists(int arr[], int n, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int temp = target - arr[i];
            if (map.containsKey(temp)) {
                return "YES";
            }
            map.put(arr[i], i);
        }
        return "NO";
    }

    public static int[] twoSumIndices(int arr[], int n, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int temp = target - arr[i];
            if (map.containsKey(temp)) {
                return new int[] { map.get(temp), i };
            }
            map.put(arr[i], i);
        }
        return new int[] { -1, -1 };
    }
}
