class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int lp = 0;
        int rp = s.length()-1;

        while(lp < rp){
            if(s.charAt(lp) != s.charAt(rp)){
                return false;
            }
            lp++; 
            rp--;
        }
        return true; 
    }
}