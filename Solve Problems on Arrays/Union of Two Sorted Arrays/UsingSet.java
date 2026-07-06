import java.util.*;

public class UsingSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        List<Integer> union = findUnion(arr1, arr2, n, m);
        for (int i = 0; i < union.size(); i++) {
            System.out.print(union.get(i) + " ");
        }
        sc.close();
    }

    public static List<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < m; i++) {
            set.add(arr2[i]);
        }

        return new ArrayList<>(set);
    }
}
