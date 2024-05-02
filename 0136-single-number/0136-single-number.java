class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        int i = 0;
        while(i < nums.length){
            ans ^= nums[i];
            i++;
        }
        return ans;
    }
}