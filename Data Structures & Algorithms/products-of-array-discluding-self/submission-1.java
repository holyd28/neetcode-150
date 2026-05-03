class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] o = new int[nums.length];
        int pre = 1;
        int post = 1;
        for (int i = 0; i < nums.length; i ++) {
            o[i] = pre;
            pre *= nums[i];
        }
        for (int i  = nums.length - 1; i >= 0; i --) {
            o[i] *= post;
            post *= nums[i];
        }
        return o;
    }
}  
