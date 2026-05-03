class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        pmin = float("inf")
        pmax = 0
        for p in prices:
            if p < pmin:
                pmin = p
            elif p - pmin > pmax:
                pmax = p - pmin
        return pmax

