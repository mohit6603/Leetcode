class Solution {
    public int[] countBits(int n) {
        int nums[] = new int[n+1];

        for(int i = 0; i<nums.length; i++){
            nums[i] = Integer.bitCount(i);
        }

        return nums;
    }
}