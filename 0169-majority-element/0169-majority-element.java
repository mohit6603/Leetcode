class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        
        int val = 0;
        int n = nums.length;
        for(Integer key : map.keySet()){
            if(map.get(key) > n/2){
                val = key;
            }
        }
        return val;
    }
}