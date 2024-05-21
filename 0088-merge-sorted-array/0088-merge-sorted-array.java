class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int tot = nums1.length;
        int rem = nums2.length;
        int j = 0;
        for(int i = tot-rem; i<tot; i++){
            nums1[i] = nums2[j];
            j++;
        }

        Arrays.sort(nums1);
    }
}