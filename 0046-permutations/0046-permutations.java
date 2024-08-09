class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> mainlist = new ArrayList<>();
        List<Integer> templist = new ArrayList<>();
        boolean visited[] = new boolean[nums.length];
        backtrack(mainlist, templist, nums, visited);
        return mainlist;
    }

    public void backtrack(List<List<Integer>> mainlist, List<Integer> templist, int[] nums, boolean[] visited){

        //base case 
        if(templist.size() == nums.length){
            mainlist.add(new ArrayList<>(templist));
            return;
        }

        //addtn
        for(int i = 0; i<nums.length; i++){
            if(visited[i] == true) continue;
            templist.add(nums[i]);
            visited[i] = true;
            backtrack(mainlist, templist, nums, visited);
            templist.remove(templist.size()-1);
            visited[i] = false;
        }
    }
}