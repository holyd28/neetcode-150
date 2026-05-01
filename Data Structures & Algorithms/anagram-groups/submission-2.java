class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> b = new HashMap<>();
        for (String s : strs) {
            int[] r = new int[26];
            for (char c : s.toCharArray()) {
                r[c - 'a']++;
            }
            StringBuilder q = new StringBuilder();
            for (int i = 0; i < 26; i ++) {
                q.append("#" + r[i]);
            }
            String p = q.toString();
            if (!b.containsKey(p)) {
                b.put(p, new ArrayList<>());
            }
            b.get(p).add(s);
            
        }
        return new ArrayList<>(b.values());
    }
}
