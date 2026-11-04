class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return nums;
        }
        int[] res = new int[nums.length];
        int mul = 1;
        for(int i = 0; i< nums.length; i++){
            mul = mul * nums[i];
            res[i] = mul;
        }
        int j = nums.length - 1;
        mul = 1;
        
        while(j >= 0){
            if(j == nums.length - 1){
                res[j] = res[j-1];
            }
            else if(j == 0){
                res[j] = mul;
            }
            else{
                res[j] = mul * res[j-1];
            }
            mul = mul * nums[j];
            j--;
        }
        return res;
    }
}  
