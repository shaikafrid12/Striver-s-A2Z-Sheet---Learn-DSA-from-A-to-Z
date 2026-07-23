import java.util.*;

public class BruteForceApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        nextpermutation(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();

    }

    private static void nextpermutation(int[] arr, int n) {

        // Generate all unique permutations of the given array
        Set<ArrayList<Integer>> uniquePerms = new HashSet<>();
        permute(arr, 0, n - 1, uniquePerms);

        // Convert set to list and sort lexicographically
        ArrayList<ArrayList<Integer>> res = new ArrayList<>(uniquePerms);
        Collections.sort(res, (a, b) -> {
            for (int i = 0; i < n; i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return Integer.compare(a.get(i), b.get(i));
                }
            }
            return 0;
        });

        // Find the index of the current permutation
        ArrayList<Integer> current = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            current.add(arr[i]);
        }

        int index = -1;
        for (int i = 0; i < res.size(); i++) {
            if (res.get(i).equals(current)) {
                index = i;
                break;
            }
        }

        // Get the next permutation (wrap around to 0 if it's the last one)
        ArrayList<Integer> next = res.get((index + 1) % res.size());

        // Update the original array
        for (int i = 0; i < n; i++) {
            arr[i] = next.get(i);
        }
    }

    // Recursive function to generate permutations
    private static void permute(int[] arr, int l, int r, Set<ArrayList<Integer>> res) {
        if (l == r) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                temp.add(arr[i]);
            }
            res.add(temp);
            return;
        }

        for (int i = l; i <= r; i++) {
            swap(arr, l, i);
            permute(arr, l + 1, r, res);
            swap(arr, l, i); // backtrack
        }
    }

    // Utility function to swap two elements
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
