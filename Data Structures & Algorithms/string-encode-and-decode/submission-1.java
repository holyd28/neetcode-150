class Solution {

    public String encode(List<String> strs) {
        StringBuilder c = new StringBuilder();
        for (String s : strs) {
            int l = s.length();
            c.append(l).append("/").append(s);
        }
        return c.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int a = str.indexOf("/", i);
            int b = Integer.parseInt(str.substring(i, a));
            res.add(str.substring(a + 1, a + 1 + b));
            i = (b + a + 1);
        }
        return res;
    }
}
