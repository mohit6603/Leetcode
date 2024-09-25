class Solution {
    public int maximumStrongPairXor(int[] nums) {
        
        int xor = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                if(Math.abs(nums[i]-nums[j]) <= Math.min(nums[i], nums[j])){
                    int newxor = nums[i]^nums[j];

                    if(newxor > xor){
                        xor = newxor;
                    }
                }
            }
        }

        return xor;
    }
}