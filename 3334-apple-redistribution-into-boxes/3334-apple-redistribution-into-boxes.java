class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int app = 0;
        int cap = 0;
        int count = 0;
        for(int i = 0; i<apple.length; i++){
            app += apple[i];
        }

        Arrays.sort(capacity);
        for(int i = capacity.length-1; i>= 0; i--){
            cap += capacity[i];
            count++;
            if(cap >= app){
                break;
            }
        }
        return count;
    }
}