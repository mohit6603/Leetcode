class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean ans = false;
        if(nums[0] < nums[nums.length-1]){
            ans = increasing(nums);
        }else if(nums[0] > nums[nums.length-1]){
            ans = decreasing(nums);
        }
        else if (nums[0] == nums[nums.length-1]){
            ans = consta(nums);
        }
        return ans;
    }

    public boolean increasing(int nums[]){
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                return false;
            }
        }
        return true;
    }

    public boolean decreasing(int nums[]){
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] < nums[i+1]){
                return false;
            }
        }
        return true;
    }

    public boolean consta(int nums[]){
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] != nums[i+1]){
                return false;
            }
        }
        return true;
    }
}