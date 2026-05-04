class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        b = {"]":"[", "}":"{", ")":"("}
        for i in s:
            if i in b:
                c = stack.pop() if stack else "/"
                if b[i] != c:
                    return False
            else:
                stack.append(i)
        return not stack