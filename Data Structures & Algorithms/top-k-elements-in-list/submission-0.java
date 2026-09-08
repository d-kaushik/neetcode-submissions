class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> hm= new HashMap<>();

        for(int i=0;i<nums.length; i++) {
            int key = nums[i];
            if(hm.containsKey(key)) {
                hm.put(key, hm.get(key)+1);
            } else {
                hm.put(key, 1);
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> hm.get(b) - hm.get(a)
        );

        for(int key: hm.keySet()) {
            pq.offer(key);
        }        

        int result[] = new int[k];
        for(int i=0; i<k; i++) {
            result[i] = pq.poll();
        }

        return result;
    }
}
