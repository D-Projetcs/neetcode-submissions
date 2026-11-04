class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> occ = new HashMap<>();
        int maxOcc = 0;
        for(int i=0; i< nums.length; i++){
            occ.put(nums[i], occ.getOrDefault(nums[i], 0) + 1);
            if (maxOcc < occ.get(nums[i])){
                maxOcc = occ.get(nums[i]);
            }
        }

        // buckets
        List<Integer>[] buckets = new List[maxOcc + 1];
        for(Integer o : occ.keySet()){
            int idx = occ.get(o);
            if(buckets[idx] == null){
                buckets[idx] = new ArrayList<>();
            }
            (buckets[idx]).add(o);
        }

        // get top non-empty K
        int[] res = new int[k];
        int bIdx = buckets.length - 1;
        for(int i = 0; i < k; i++){
            while(bIdx > -1 && (buckets[bIdx] == null || buckets[bIdx].isEmpty())){
                bIdx--;
            }
            res[i] = buckets[bIdx].remove(buckets[bIdx].size() - 1);
        }

        return res;
        
    }
}