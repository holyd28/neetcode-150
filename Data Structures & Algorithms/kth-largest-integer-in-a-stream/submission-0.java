class KthLargest {
    private final PriorityQueue<Integer> minHeap;
    private final int k;

    public KthLargest(int k, int[] nums) {
        this.minHeap = new PriorityQueue<>(k);
        this.k = k;

        for (int i : nums) {
        add(i);
        }
    }
    
    public int add(int val) {
        this.minHeap.offer(val);

        if (this.minHeap.size() > k) {
            this.minHeap.poll();
        }

        return this.minHeap.peek();
    }
}
