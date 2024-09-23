class Solution {
    public int[] finalPrices(int[] nums) {
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] <= nums[i]){
                    nums[i] = nums[i]-nums[j];
                    break;
                }
            }
        }
        return nums;
    }
}