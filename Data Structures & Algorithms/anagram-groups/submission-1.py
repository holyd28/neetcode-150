class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        b = defaultdict(list)
        for s in strs:
            r = [0] * 26
            for c in s:
                r[ord(c) - ord("a")] += 1
            b[tuple(r)].append(s)
        return list(b.values())