import java.util.*;

public class OptimalApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(longestConsecutive(arr, n));
        sc.close();
    }

    public static int longestConsecutive(int[] arr, int n) {
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < n; i++) {
            st.add(arr[i]);
        }
        int longest = 1;
        for (int i : st) {
            if (!st.contains(i - 1)) {
                int cnt = 1;
                int current = i;
                while (st.contains(current + 1)) {
                    current++;
                    cnt++;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}
