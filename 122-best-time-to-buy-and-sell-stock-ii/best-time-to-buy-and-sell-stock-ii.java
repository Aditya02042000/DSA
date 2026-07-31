class Solution {

    int[][] dp;

    int findAns(int idx, int buy, int[] prices) {

        if (idx == prices.length)
            return 0;

        if (dp[idx][buy] != -1)
            return dp[idx][buy];

        if (buy == 1) {

            int buyStock = -prices[idx] + findAns(idx + 1, 0, prices);
            int notBuy = findAns(idx + 1, 1, prices);

            return dp[idx][buy] = Math.max(buyStock, notBuy);

        } else {

            int sell = prices[idx] + findAns(idx + 1, 1, prices);
            int notSell = findAns(idx + 1, 0, prices);

            return dp[idx][buy] = Math.max(sell, notSell);
        }
    }

    public int maxProfit(int[] prices) {

        dp = new int[prices.length][2];

        for (int i = 0; i < prices.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        return findAns(0, 1, prices);
    }
}