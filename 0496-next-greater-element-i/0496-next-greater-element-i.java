class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length];
        Arrays.fill(arr, -1);

        for(int i = 0; i<nums1.length; i++){
            for(int j = 0; j<nums2.length; j++){
                if(nums1[i] == nums2[j] && j != nums2.length-1){
                    if(nums2[j+1] > nums2[j]){
                        arr[i] = nums2[j+1];
                        break;
                    }else if(nums2[j+1] <= nums2[j]){
                        for(int n = j+2; n<nums2.length; n++){
                        if(nums2[n] > nums1[i]){
                            arr[i] = nums2[n];
                            break;
                        }
                    }
                    }
                }
            }
        }
        return arr;
    }
}