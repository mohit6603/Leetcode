class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l = flowerbed.length;
        int i = 0;

        while(i < l && n > 0){
            if(flowerbed[i] == 1) i += 2;
            else if(i == l-1 || flowerbed[i+1] == 0){
                n--;
                i += 2;
            }
            else i += 3;
        }

        return n <= 0;
    }
}