class Solution {

    // int[][] dp;

    // int findAns(int idx, int buy, int[] prices) {

    //     if (idx == prices.length)
    //         return 0;

    //     if (dp[idx][buy] != -1)
    //         return dp[idx][buy];

    //     if (buy == 1) {

    //         int buyStock = -prices[idx] + findAns(idx + 1, 0, prices);
    //         int notBuy = findAns(idx + 1, 1, prices);

    //         return dp[idx][buy] = Math.max(buyStock, notBuy);

    //     } else {

    //         int sell = prices[idx] + findAns(idx + 1, 1, prices);
    //         int notSell = findAns(idx + 1, 0, prices);

    //         return dp[idx][buy] = Math.max(sell, notSell);
    //     }
    // }

    public int maxProfit(int[] prices) {

        // dp = new int[prices.length][2];

        // for (int i = 0; i < prices.length; i++) {
        //     Arrays.fill(dp[i], -1);
        // }

        // return findAns(0, 1, prices);
        int n=prices.length;
        ArrayList<Integer> ahead = new ArrayList<>();
            ahead.add(0);
            ahead.add(0);

        ArrayList<Integer> curr = new ArrayList<>();
        curr.add(0);
        curr.add(0);

        for (int i = n - 1; i >= 0; i--) {

            for (int j = 0; j < 2; j++) {

                if (j == 1) {
                    int by = -prices[i] + ahead.get(0);
                    int notby = ahead.get(1);
                    curr.set(j, Math.max(by, notby));
                } else {
                    int sell = prices[i] + ahead.get(1);
                    int notsell = ahead.get(0);
                    curr.set(j, Math.max(sell, notsell));
        }
    }

    ahead = new ArrayList<>(curr);
}

return ahead.get(1);
    }
}