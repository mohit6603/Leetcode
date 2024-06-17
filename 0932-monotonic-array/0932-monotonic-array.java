class Solution {
    public boolean isMonotonic(int[] nums) {
        int i = 0;
        if(nums.length == 1){
            return true;
        }
        if(nums[i] == nums[i+1]){
            boolean ans = increasing(nums);
            boolean dec = decreasing(nums);
            if(dec == true || ans == true) return true;
            else return false;
        }
        if(nums[i] < nums[i+1]){
            return increasing(nums);
        }
        else{
            return decreasing(nums);
        }
    }

    public boolean increasing(int[] nums){
        boolean a = true;
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                a = false;
            }
        }
        return a;
    }

    public boolean decreasing(int[] nums){
        boolean aa = true;
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i] < nums[i+1]){
                aa = false;
            }
        }
        return aa;
    }
}    
