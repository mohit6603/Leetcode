class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int ans[] = new int[nums.length];
        Arrays.fill(ans, 0);
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<nums.length; i++){
            int k = nums[i];
            if(ans[k-1] == 0){
                ans[k-1] = nums[i];
            }
        }

        for(int i = 0; i<ans.length; i++){
            if(ans[i] == 0){
                list.add(i+1);
            }
        }
        return list;
    }
}