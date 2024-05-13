class Solution {
    public int strStr(String h, String n) {
        for(int i = 0; i<h.length()-n.length()+1; i++){
            if(h.charAt(i) == n.charAt(0)){
                if(h.substring(i, i+n.length()).equals(n)){
                    return i;
                }
            }
        }
        return -1;
    }
}