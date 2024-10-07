class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int total = n*(n+1)/2;

        int rem = 0;
        for(int i = 0; i<n; i++){
            rem += nums[i];
        }

        return Math.abs(total-rem);
    }
}