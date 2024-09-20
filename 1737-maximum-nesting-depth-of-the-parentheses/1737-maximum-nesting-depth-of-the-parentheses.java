class Solution {
    public int maxDepth(String s) {
        int par = 0;
        int maxpar = 0;

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '(') par++;
            if(par > maxpar) maxpar = par;
            if(s.charAt(i) == ')') par--;
            else continue;
        }

        return maxpar;
    }
}