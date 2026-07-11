import java.util.*;

public class OptimisedApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(appearOnce(arr));
        sc.close();
    }

    public static int appearOnce(int arr[]) {
        int xor = 0;
        for (int x : arr) {
            xor = xor ^ x;
        }
        return xor;
    }
}
