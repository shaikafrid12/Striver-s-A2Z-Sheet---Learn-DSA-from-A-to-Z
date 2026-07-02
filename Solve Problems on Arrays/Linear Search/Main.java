import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        linearSearch(arr, num);
        sc.close();
    }

    public static void linearSearch(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }
}