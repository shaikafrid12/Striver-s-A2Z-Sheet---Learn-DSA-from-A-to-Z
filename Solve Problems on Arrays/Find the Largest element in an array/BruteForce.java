import java.util.*;

public class BruteForce {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
        sc.close();
    }
}
