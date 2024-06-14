class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        boolean visited[] = new boolean[nums.length];

        backtrack(result, visited, curr, nums);

        return result;
    }

    public static void backtrack(List<List<Integer>> result, boolean visited[], List<Integer> curr, int nums[]){
        if(curr.size() == nums.length){
            //result.add(curr);
            result.add(new ArrayList(curr));
            return;
        }

        for(int i = 0; i<nums.length; i++){
            if(visited[i] == true){
                continue;
            }
            curr.add(nums[i]);
            visited[i] = true;
            backtrack(result, visited, curr, nums);
            curr.remove(curr.size()-1);
            visited[i] = false;
        }
    }
}