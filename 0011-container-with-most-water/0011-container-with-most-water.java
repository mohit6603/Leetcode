class Solution {
    public int maxArea(int[] height) {
        int lp = 0;
        int rp = height.length-1;
        int maxWater = 0;
        while(lp <= rp){
            int ht = Math.min(height[lp], height[rp]);
            int wid = rp - lp;
            int curwater = ht*wid;
            maxWater = Math.max(curwater, maxWater);

            if(height[lp] < height[rp]){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
    }
}