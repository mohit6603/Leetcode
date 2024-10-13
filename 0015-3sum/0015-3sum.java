class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> mainlist = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for(int  i = 0; i < n; i++){
            if( i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int n1 = nums[i];
            int target = -n1;
            int lp = i+1;
            int rp = n-1;

            while(lp < rp){
                if(nums[lp] + nums[rp] > target) rp--;
                else if(nums[lp]+nums[rp] < target) lp++;
                else {
                    while(lp < rp && nums[lp] == nums[lp+1]) lp++;
                    while(lp < rp && nums[rp] == nums[rp-1]) rp--;
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[lp]);
                    list.add(nums[rp]);
                    list.add(-target);
                    mainlist.add(new ArrayList<>(list));
                    lp++;
                    rp--;
                }
            }
        }
        return mainlist;
    }
}