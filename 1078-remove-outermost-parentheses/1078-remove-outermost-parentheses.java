class Solution {
    public String removeOuterParentheses(String s) {
        if(s.length() == 0 || s.length() == 2) return "";

        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' && count == 0){
                count++;
            }
            else if(c == '(' && count >= 1){
                sb.append(c);
                count++;
            }
            else if(c == ')' && count > 1){
                sb.append(c);
                count--;
            }
            else if(c == ')' && count == 1){
                count--;
            }
        }

        return sb.toString();
    }
}