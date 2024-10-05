class Solution {
    public boolean isPalindrome(String s) {
        if(s == null)return false;
        s = s.toLowerCase();

        int lp = 0;
        int rp = s.length()-1;

        while(lp < rp){
            if(!isAlphanumeric(s.charAt(lp))){
                lp++;
            }
            else if(!isAlphanumeric(s.charAt(rp))){
                rp--;
            }
            else if(s.charAt(lp) != s.charAt(rp)){
                return false;
            }
            else{
                lp++;
                rp--;
            }
        }
        return true;
    }

    private boolean isAlphanumeric(char ch){
        return (ch  >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');
    }
}
