class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0;
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            xor = nums[i]^i;
            if(xor == 0 && (i == nums.length-1)){
                return nums.length;
            }
            if(xor != 0){
                return i;
            }
        }
        return -1;
    }
}