import java.util.*;

public class BruteForceApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = productsubarray(arr, n);
        System.out.println(x);
        sc.close();
    }

    public static int productsubarray(int arr[], int n) {
        int maxprod = arr[0];
        for (int i = 0; i < n; i++) {
            int prod = 1;
            for (int j = i; j < n; j++) {
                prod *= arr[j];
                if (prod > maxprod) {
                    maxprod = prod;
                }
            }
        }
        return maxprod;
    }
}
