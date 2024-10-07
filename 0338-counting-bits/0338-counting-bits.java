class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        int count = 0;

        for(int i = 0; i <= n; i++){
            ans[i] = bitcount(i);
        }

        return ans;
    }

    public int bitcount(int i){
        int count = 0;
        while(i  > 0){
            count += i&1;
            i >>= 1;
        }
        return count;
    }
}