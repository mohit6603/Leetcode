class Solution {
    public int[] sortArray(int[] nums) {
        int si = 0, ei = nums.length-1;
        mergeSort(nums, si, ei);
        return nums;
    }

    public static void mergeSort(int[] nums, int si, int ei){
        if(si >= ei){
            return;
        }
            int mid = si+(ei-si)/2;
            mergeSort(nums, si, mid);
            mergeSort(nums, mid+1, ei);
            merge(nums, si, mid, ei);
    }

    public static void merge(int[] nums, int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si, j = mid+1, k = 0;

        while(i <= mid && j <= ei){
            if(nums[i] < nums[j]){
                temp[k] = nums[i];
                i++;
            }
            else{
                temp[k] = nums[j];
                j++;
            }
            k++;
        }

        while(i <= mid){
            temp[k++] = nums[i++];
        }
        while(j <= ei){
            temp[k++] = nums[j++];
        }
        // int m = 0;
        // for(int n = 0; n < temp.length; n++){
        //     nums[m++] = temp[n];
        // }

        System.arraycopy(temp, 0, nums, si, temp.length);
        
    }
}