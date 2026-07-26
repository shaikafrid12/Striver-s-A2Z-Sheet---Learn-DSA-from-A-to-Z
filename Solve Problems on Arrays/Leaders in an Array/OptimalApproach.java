import java.util.*;

public class OptimalApproach {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> temp = new ArrayList<>();

        temp = leader(arr, n);
        for (int i : temp)
            System.out.print(i + " ");

        sc.close();
    }

    public static ArrayList<Integer> leader(int arr[], int n) {
        ArrayList<Integer> temp = new ArrayList<>();
        int max_leader = arr[n - 1];
        temp.add(max_leader);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max_leader) {
                max_leader = arr[i];
                temp.add(max_leader);
            }
        }
        Collections.reverse(temp);
        return temp;
    }
}
