class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        helper(0, nums, result, subset);

        return result;
    }

    public void helper(int idx, int nums[], List<List<Integer>> result, List<Integer> subset){
        //base case
        if(idx == nums.length){
            result.add(new ArrayList<>(subset));
            return;
        }

        //kaam 1add  1remove
        subset.add(nums[idx]);
        helper(idx+1, nums, result, subset);
        subset.remove(subset.size()-1);
        helper(idx+1, nums, result, subset);

    }
}