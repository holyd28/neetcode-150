class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> box1 = new HashMap<>();
        HashMap<Character,Integer> box2 = new HashMap<>();

        IntStream.range(0, s.length())
        .forEach(x -> 
        box1.put(s.charAt(x), box1.getOrDefault(s.charAt(x), 0) + 1));

        IntStream.range(0, t.length())
        .forEach(x -> 
        box2.put(t.charAt(x), box2.getOrDefault(t.charAt(x), 0) + 1));

        return box1.equals(box2);
    }
}
