class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        b = {}
        for i, n in enumerate(nums):
            x = target - n
            if n in b:
                return [b[n], i]
            b[x] = i