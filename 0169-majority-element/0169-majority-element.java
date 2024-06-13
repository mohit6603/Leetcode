class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else{
                map.put(i, 1);
            }
        }
        int ans = 0;
        for(Integer i :map.keySet()){
            if(map.get(i) > nums.length/2){
                ans = i;
            }
        }
        return ans;
    }
}