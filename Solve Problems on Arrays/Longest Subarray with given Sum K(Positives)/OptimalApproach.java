import java.util.*;

public class OptimalApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int maxlen = 0;
        int left = 0, right = 0;
        int currentsum = 0;
        while (right < n) {
            currentsum += arr[right];
            while (currentsum > x) {
                currentsum -= arr[left];
                left++;
            }
            if (currentsum == x) {
                maxlen = Math.max(maxlen, (right - left + 1));
            }
            right++;
        }
        System.out.println(maxlen);
        sc.close();
    }
}
