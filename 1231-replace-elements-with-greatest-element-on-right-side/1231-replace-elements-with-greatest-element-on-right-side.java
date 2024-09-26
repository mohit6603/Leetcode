class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        if(n == 1){
            arr[0] = -1;
            return arr;
        }

        int nums[] = new int[n];
        nums[n-1] = -1;

        for(int i = n-2; i>=0; i--){
            nums[i] = Math.max(nums[i+1], arr[i+1]);
        }

        return nums;
    }
}