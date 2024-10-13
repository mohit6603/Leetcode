class Solution {
    public int maxArea(int[] height) {
        int lp = 0;
        int rp = height.length-1;
        int maxWater = -1;

        while(lp < rp){
            int length = Math.abs(lp-rp);
            int width = Math.min(height[lp], height[rp]);
            int water = length*width;

            if(water > maxWater){
                maxWater = water;
            }

            if(height[lp] < height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
}