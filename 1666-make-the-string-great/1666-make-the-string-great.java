class Solution {
    public String makeGood(String s) {
        if(s.length() == 0 || s.length() == 1) return s;

        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(st.isEmpty()) st.push(ch);
            else if(ch+32 == st.peek() || ch-32 == st.peek()) st.pop();
            else st.push(ch);
        }

        s = "";
        while(!st.isEmpty()){
            s  = st.pop() + s;
        } 
        return s;
    }
}