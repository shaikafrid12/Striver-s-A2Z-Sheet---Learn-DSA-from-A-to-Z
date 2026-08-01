import java.util.*;

public class BruteForceApproach {
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
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

}
