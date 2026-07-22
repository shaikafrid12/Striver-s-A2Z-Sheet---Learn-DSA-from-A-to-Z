import java.util.*;

public class BruteForceApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        System.out.println(maxProfit(prices, n));
        sc.close();
    }

    private static int maxProfit(int[] prices, int n) {
        int maxprofit = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                maxprofit = Math.max(maxprofit, prices[j] - prices[i]);
            }
        }
        return maxprofit;
    }
}
