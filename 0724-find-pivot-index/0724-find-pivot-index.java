class Solution {
    public int pivotIndex(int[] nums) {
        int ans = -1;
        int total = 0;
        int lsum = 0;

        for(int i = 0; i < nums.length; i++){
            total += nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            if(lsum == total-nums[i]-lsum){
                ans = i;
                break;
            }
            lsum += nums[i];
        }
        return ans;
    }
}