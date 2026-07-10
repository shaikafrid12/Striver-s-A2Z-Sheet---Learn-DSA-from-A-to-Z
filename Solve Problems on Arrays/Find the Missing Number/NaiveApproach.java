import java.util.*;

public class NaiveApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int missingNum = findMissingNumber(arr, n);
        System.out.println(missingNum);
        sc.close();
    }

    public static int findMissingNumber(int arr[], int n) {
        for (int i = 1; i <= n; i++) {
            boolean find = false;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    find = true;
                    break;
                }
            }
            if (find == false) {
                return i;
            }
        }
        return -1;
    }
}