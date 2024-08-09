class Solution {
    public int[] countBits(int n) {
        //if(n == 0 || n == 1) return new arr{n};
        int nums[] = new int [n+1];

        for(int i = 0; i <= n; i++){
            int ans = Integer.bitCount(i);
            nums[i] = ans;
        }
        return nums;
    }
}