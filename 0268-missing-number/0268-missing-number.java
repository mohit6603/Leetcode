class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int tot = 0;
        int rem = 0;

        for(int i = 1; i<=nums.length; i++){
            tot += i;
        }

        for(int i = 0; i<nums.length; i++){
            rem += nums[i];
        }

        return tot-rem;
    }
}