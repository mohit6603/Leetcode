class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> bucket [] = new List[nums.length+1];


        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(int key : map.keySet()){
            int freq = map.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int res[] = new int[k];
        int j = 0;

        for(int i = nums.length; i >= 0 && j < k; i--){
            // if(i >= k){break;}

            if(bucket[i] != null){
                for(int n : bucket[i]){
                    res[j] = n;
                    j++;
                } 
            }
        }
        return res;
    }
}