class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int [nums1.length];
        Arrays.fill(ans, -1);

        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j] && j != nums2.length-1){
                    if(nums2[j+1] > nums2[j]){
                        ans[i] = nums2[j+1];
                        break;
                    }
                    else{
                        for(int k = j+2; k < nums2.length; k++){
                            if(nums2[k] > nums2[j]){
                                ans[i] = nums2[k];
                                break;
                            }
                        }
                    }
                }
            }
        }

        return ans;
    }
}