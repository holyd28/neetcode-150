class Solution:

    def encode(self, strs: List[str]) -> str:
        res = ""
        for s in strs:
            res += str(len(s)) + "/" + s
        return res

    def decode(self, s: str) -> List[str]:
        res = []
        i = 0
        while i < len(s):
            a = s.index("/", i) 
            b = int(s[i:a])
            res.append(s[a + 1:b + a + 1])
            i = b + a + 1
        return res