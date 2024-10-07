class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int total = 0;
        for(int i = 0; i <= n; i++){
            total += i;
        }

        int rem = 0;
        for(int i = 0; i<n; i++){
            rem += nums[i];
        }

        return Math.abs(total-rem);
    }
}