class Solution {
    public int maxProfit(int[] prices) {
        int a = prices[0], b = 0, pft = 0;
        for (int i = 1; i < prices.length; i++) {
            a = Math.min(a, prices[i]);
            pft = Math.max(pft, prices[i]-a);
        }
        return pft;
    }
}