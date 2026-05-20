class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer,Integer> m = new HashMap<>();
        while (!m.containsKey(1)) {
            int res = 0;
            while (n > 0) {
                res += Math.pow(n % 10, 2);
                n /= 10;
            }
            if (m.containsKey(res)) {
                return false;
            }
            m.put(res, 1);
            n = res;
        }
        return true;
    } 
}
