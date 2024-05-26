class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultlist = new ArrayList<>();
        List<Integer> templist = new ArrayList<>();

        backTrack(nums, resultlist, templist, 0);

        return resultlist;
    }

    public void backTrack(int [] nums, List<List<Integer>> resultlist, List<Integer> templist ,int start){
        resultlist.add(new ArrayList<>(templist));

        for(int i = start; i<nums.length; i++){
            templist.add(nums[i]);

            backTrack(nums, resultlist, templist, i+1);

            templist.remove(templist.size()-1);
        }
    }
}