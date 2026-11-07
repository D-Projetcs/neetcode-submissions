class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return nums.length;
        }

        Set<Integer> s = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            s.add(nums[i]);
        }
        int len = -1;
        for(Integer i : s){
            if(s.contains(i-1)){
                continue;
            }
            else{
                // start
                int currLen = 1;
                int toCheck = i;
                while(s.contains(i+1)){
                    currLen++;
                    i = i + 1;
                }
                len = Math.max(len, currLen);
            }
        }
        return len;
    }
}
