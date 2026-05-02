class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        b = {}
        for n in nums:
            b[n] = b.get(n, 0) + 1
        p = [[] for _ in range(len(nums) + 1)]
        for i, j in b.items():
            p[j].append(i)
        res = []
        for a in range(len(p) - 1, 0, -1):
            for t in p[a]:
                res.append(t)
                if len(res) == k:
                    return res