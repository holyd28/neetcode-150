class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = sum(n);
        while (fast != 1 && fast != slow) {
            slow = sum(slow);
            fast = sum(sum(fast));
        }
        return fast == 1;
    } 

    public int sum(int x) {
        int res = 0;
        while (x > 0) {
            int d = x % 10;
            res += d * d;
            x /= 10;
        }
        return res;
    }
}
