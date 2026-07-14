import java.util.*;

public class BruteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int currentsum = 0;
                for (int k = i; k <= j; k++) {
                    currentsum += arr[k];
                }
                if (currentsum == x) {
                    maxLen = Math.max(maxLen, (j - i + 1));
                }
            }
        }
        System.out.println(maxLen);
        sc.close();
    }

}
