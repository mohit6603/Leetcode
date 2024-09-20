class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int ii = 0;

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '(' && ii == 0) ii++;
            else if(ch == '(' && ii >= 1) {
                sb.append(ch);
                 ii++;}
            else if(ch == ')' && ii > 1){
                sb.append(ch); 
                ii--;}
            else if(ch == ')' && ii == 1) ii--;
        }

        return sb.toString();
    }
}