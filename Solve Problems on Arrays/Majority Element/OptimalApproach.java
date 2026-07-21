import java.util.*;

public class OptimalApproach {
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
        int count = 0;
        int element = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count = 1;
                element = 1;
            } else if (element == arr[i]) {
                count++;
            } else {
                count--;
            }
        }

        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                count1++;
            }
        }
        if (count1 > n / 2) {
            return element;
        }
        return -1;
    }
}
