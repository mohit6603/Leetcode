class Solution {
    public int findMin(int[] nums) {
        int min = 6000;
        for(int i = 0; i < nums.length; i++){
            if(min > nums[i]){
                min = nums[i];
            }
        }
        return min;
    }
}