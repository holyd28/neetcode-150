class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        box = []
        for n in nums:
            if n in box:
                return True
            else:
                box.append(n)
        return False