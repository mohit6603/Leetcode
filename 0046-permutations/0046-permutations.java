class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        boolean visit[] = new boolean[nums.length];

        backtrack(nums, result, curr, visit);
        return result;
    }

    public void backtrack(int[] nums, List<List<Integer>> result, List<Integer> curr, boolean visit[]){

        // base case
        if(curr.size() == nums.length){
            result.add(new ArrayList(curr));
            return;
        }

        // iterate
        for(int i = 0; i<nums.length; i++){
            if(visit[i] == true) continue;

            // add to curr
            curr.add(nums[i]);
            visit[i] = true;

            // func call
            backtrack(nums, result, curr, visit);

            //remove in bcktrk
            curr.remove(curr.size()-1);
            visit[i] = false;

        }
    }
}