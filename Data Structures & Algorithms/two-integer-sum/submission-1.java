class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> b = new HashMap<>();
        return IntStream.range(0, nums.length)
        .filter(i -> {
            int x = target - nums[i];
            if (!b.containsKey(x)) {
                b.put(nums[i], i);
                return false;
            } else {
                return true;
            }
        }).boxed()
        .map(x -> new int[] {b.get(target - nums[x]), x})
        .findFirst().orElseGet(() -> new int[] {});
        
    }
}
