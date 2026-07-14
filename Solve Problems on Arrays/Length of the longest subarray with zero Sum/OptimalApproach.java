import java.util.*;

public class OptimalApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxlen = 0;
        Map<Integer, Integer> temp = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0) {
                maxlen = i + 1;
            } else {
                if (temp.containsKey(sum)) {
                    maxlen = Math.max(maxlen, i - temp.get(sum));
                } else {
                    temp.put(sum, i);
                }
            }
        }
        System.out.println(maxlen);
        sc.close();
    }
}
