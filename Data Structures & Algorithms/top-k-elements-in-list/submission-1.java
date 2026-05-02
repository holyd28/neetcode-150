class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> a = new HashMap<>();
        for (int b : nums) {
            a.put(b, a.getOrDefault(b, 0) + 1);
        }
        List<Integer>[] c = new List[nums.length + 1];
        for (int d = 0; d < c.length; d ++) {
            c[d] = new ArrayList<>();
        }

        for (int e : a.keySet()) {
            c[a.get(e)].add(e);
        }

        int[] res = new int[k];
        int g = 0;

        for (int f = c.length - 1; f >=0 && g < k; f --) {
            for (int h : c[f]) {
                res[g ++] = h;
                if (g == k) {
                    return res;
                }
        }
    }
    return res;
    }}

