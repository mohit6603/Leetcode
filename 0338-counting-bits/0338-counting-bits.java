class Solution {
    
    public int[] countBits(int n) {
        int nums[] = new int[n+1];
        for(int i = 0; i<=n; i++){
            nums[i] = bitcount(i);
        }
        return nums;
    }

    public int bitcount(int i){
        int count = 0;
        while(i > 0){
            count += i & 1;
            i >>= 1;
        }
        return count;
    }
}