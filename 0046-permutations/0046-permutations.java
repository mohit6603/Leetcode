class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(0, nums, result);

        return result;
    }

    public void swap(int i, int j, int nums[]){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public void helper(int index, int nums[], List<List<Integer>> result){
        
        //base case
        if(index == nums.length){
            List<Integer> ans = new ArrayList<>();
            for(int i = 0; i<nums.length; i++){
                ans.add(nums[i]);
            }
            result.add(new ArrayList<>(ans));
            return;
        }

        //kaam
        for(int i = index; i<nums.length; i++){
            swap(i, index, nums);
            helper(index+1, nums, result);
            swap(i, index, nums);
        }
    }
}