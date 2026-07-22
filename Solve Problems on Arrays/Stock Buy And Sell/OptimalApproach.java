import java.util.*;

public class OptimalApproach {
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
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int p : prices) {
            if (p < minprice)
                minprice = p;
            else
                maxprofit = Math.max(maxprofit, p - minprice);
        }
        return maxprofit;
    }
}
