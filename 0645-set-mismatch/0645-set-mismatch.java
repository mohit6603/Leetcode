class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[] = new int [2];
        Arrays.sort(nums);
        //repeating find
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                arr[0] = nums[i];
                break;
            }
        }

        //missing find
        int tot = 0;
        for(int i = 1; i<=nums.length;i++){
            tot += i;
        }
        int ans = 0;
        for(int i = 0; i<nums.length;i++){
            ans += nums[i];
        }
        ans -= arr[0];
        arr[1] = tot-ans; 

        return arr;
    }
}