import java.util.*;

public class BruteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = majorityelement(arr, n);
        System.out.println(x);
        sc.close();
    }

    public static int majorityelement(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    cnt++;
                }
            }
            if (cnt > (n / 2)) {
                return arr[i];
            }
        }
        return -1;
    }

}
