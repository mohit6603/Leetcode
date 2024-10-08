class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans []= new int[k];
        Map<Integer, Integer> map  = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }

        int j = 0;
        while(k > 0){
            int max = -100000;
            for(int i : map.keySet()){
                if(map.get(i) > max){
                    max = map.get(i);
                    ans[j] = i;
                }
            }
            map.remove(ans[j]);
            j++;
            k--;
        } 

        return ans;
    }
}