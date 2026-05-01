class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> l = IntStream.of(nums).boxed().distinct().toList();
        return nums.length != l.size();
    }
}