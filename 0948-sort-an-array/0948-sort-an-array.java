class Solution{
    public int[] sortArray(int[] nums){
        int i = 0;
        int ans[] = new int [nums.length];
        Queue<Integer> pq = new PriorityQueue<>();

        for(int j = 0; j< nums.length; j++){
            pq.offer(nums[j]);
        }

        while(!pq.isEmpty()){
            ans[i++] = pq.poll();
        }

        return ans;
    }
}