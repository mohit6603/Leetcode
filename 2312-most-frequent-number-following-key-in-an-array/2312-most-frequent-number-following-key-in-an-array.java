class Solution {
    public int mostFrequent(int[] nums, int key) {
        int arr[] = new int[1001];
        for(int i = 1; i<nums.length; i++){
            if(nums[i-1] == key){
                arr[nums[i]]++;
            }
        }

        int result = -1;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < 1001; i++){
            if(arr[i] > max){
                max = arr[i];
                result = i;
            }
        }
        return result;
    }
}