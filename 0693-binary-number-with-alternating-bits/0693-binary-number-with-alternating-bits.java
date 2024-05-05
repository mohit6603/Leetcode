class Solution {
    public boolean hasAlternatingBits(int n) {
        boolean ans = true;
        String str = Integer.toBinaryString(n);
        int size = str.length();
        if(size == 1){
            // ans = false;
            return ans;
        }
        else{
            for(int i = 0;i<size-1; i++){
                if(str.charAt(i) == str.charAt(i+1)){
                    ans = false;
                }
            }
        }

        return ans;
    }
}