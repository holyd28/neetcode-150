class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        b = {}
        for s in strs:
            r = ''.join(sorted(s))
            if r in b:
                b[r] += [s]
            else:
                b[r] = [s]
        return list(b.values())