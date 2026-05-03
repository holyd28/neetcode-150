class Solution {
    public int maxProfit(int[] prices) {
        int pmin = Integer.MAX_VALUE;
        int pmax = 0;
        for (int p : prices) {
            pmin = Math.min(p, pmin);
            pmax = Math.max(p - pmin, pmax);
        }
        return pmax;
    }
}
