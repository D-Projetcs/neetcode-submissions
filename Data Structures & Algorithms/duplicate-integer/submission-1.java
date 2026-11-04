class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums.length == 0 || nums.length == 1)
            return false;
        HashSet<Integer> u = new HashSet<Integer>();

        for (int i : nums){
            if(u.contains(i))
                return true;
            else
                u.add(i);
        }
        return false;
        
    }
}