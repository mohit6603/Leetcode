class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        if(n == 0 || n == 1 || n == 2 || n == 3){
            return n;
        }

        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i < dp.length; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }

        return dp[n];
    }
}