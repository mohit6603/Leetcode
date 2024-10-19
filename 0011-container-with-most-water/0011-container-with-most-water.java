class Solution {
    public int maxArea(int[] height) {
        int lp = 0;
        int rp = height.length-1;
        int max = Integer.MIN_VALUE;

        while(lp < rp){
            int len = rp-lp;
            int wid = Math.min(height[lp], height[rp]);
            int water = len*wid;

            if(water > max){
                max = water;
            }

            if(height[lp] > height[rp]){
                rp--;
            }else{
                lp++;
            }
        }
        return max;
    }
}