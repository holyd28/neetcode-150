class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        HashMap<Character,Character> m = new HashMap<>(3);
        m.put('}', '{');
        m.put(')', '(');
        m.put(']', '[');
        for (char c : s.toCharArray()) {
            if (m.containsKey(c)) {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (m.get(c) != top) {
                    return false;
                }
            }
        else {
            stack.push(c);
        }
    }
    return stack.isEmpty();
    }
}

