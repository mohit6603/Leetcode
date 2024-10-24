class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int i = 0;
        
        // Calculate the sum of the first k elements
        while (i < k) {
            sum += nums[i];
            i++;
        }
        
        int maxSum = sum;
        
        // Continue sliding the window and updating sum and maxSum
        while (i < nums.length) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
            i++;
        }
        
        // Return the maximum average
        return (double) maxSum / k;
    }
}
