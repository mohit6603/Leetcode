class Solution {
    public void moveZeroes(int[] nums) {
        int arr[] = new int[nums.length];
        int j = 0;
        for(int i : nums){
            if(i != 0){
                arr[j] = i;
                j++;
            }
        }

        while(j < arr.length){
            arr[j] = 0;
            j++;
        }

        for(int i = 0; i<arr.length; i++){
            nums[i] = arr[i];
        }
    }
}