import java.util.*;

public class OptimalApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < n; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }
        int minFreq = Integer.MAX_VALUE;
        int maxFreq = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (freq.get(arr[i]) < minFreq) {
                minFreq = freq.get(arr[i]);
            }
            if (freq.get(arr[i]) > maxFreq) {
                maxFreq = freq.get(arr[i]);
            }
        }

        System.out.println(minFreq);
        System.out.println(maxFreq);

        sc.close();
    }
}
