import java.util.*;

public class OptimalApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxvalue = arr[0];

        for (int i = 1; i < n; i++) {
            if (maxvalue < arr[i]) {
                maxvalue = arr[i];
            }
        }
        System.out.println(maxvalue);
        sc.close();
    }

}
