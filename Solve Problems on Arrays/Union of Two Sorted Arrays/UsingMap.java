import java.util.*;

public class UsingMap {
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

        UsingMap obj = new UsingMap();
        List<Integer> union = obj.findUnion(arr1, arr2, n, m);
        for (int i = 0; i < union.size(); i++) {
            System.out.print(union.get(i) + " ");
        }
        sc.close();
    }

    public List<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
        }
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], map.getOrDefault(arr2[i], 0) + 1);
        }
        List<Integer> union = new ArrayList<>();
        for (int i : map.keySet()) {
            union.add(i);
        }

        return union;
    }
}
