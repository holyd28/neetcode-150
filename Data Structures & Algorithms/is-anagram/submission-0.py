class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        box1 = {}
        box2 = {}
        for l in s:
            if l in box1:
                box1[l] += 1
            else:
                box1[l] = 1
        for l in t:
            if l in box2:
                box2[l] += 1
            else:
                box2[l] = 1
        return box1 == box2