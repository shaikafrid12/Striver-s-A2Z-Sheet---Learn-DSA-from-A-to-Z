import java.util.*;

public class BruteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> temp = new ArrayList<>();
        temp = leader(arr, n);
        for (int i : temp) {
            System.out.print(i + " ");
        }
        sc.close();
    }

    public static ArrayList<Integer> leader(int[] arr, int n) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean lead = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] >= arr[i]) {
                    lead = false;
                    break;
                }
            }
            if (lead) {
                temp.add(arr[i]);
            }
        }
        return temp;
    }
}
