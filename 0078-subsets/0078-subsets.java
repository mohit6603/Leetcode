class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();

        backtrack(result, sub, nums , 0);
        return result;
    }

    public static void backtrack(List<List<Integer>> result, List<Integer> sub, int[] nums, int i){
        if(i == nums.length){
            result.add(new ArrayList(sub));
            return;
        }
            
        sub.add(nums[i]);
        backtrack(result, sub, nums, i+1);
        sub.remove(sub.size()-1);

        backtrack(result, sub, nums, i+1);
        
    }
}