import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        Set<Integer> union = findUnion(arr1, arr2, n, m);

        // Only this part is changed
        List<Integer> list = new ArrayList<>(union);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
        sc.close();
    }

    public static Set<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        Set<Integer> union = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            union.add(arr1[i]);
        }

        for (int i = 0; i < m; i++) {
            if (union.contains(arr2[i])) {
                continue;
            }
            union.add(arr2[i]);
        }

        return union;
    }
}