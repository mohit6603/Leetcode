class Solution {
    public String removeDuplicates(String s) {
        if(s.length() == 0 || s.length() == 1) return s;

        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(st.isEmpty()) st.push(s.charAt(i));
            else if(s.charAt(i) == st.peek()) st.pop();
            else st.push(s.charAt(i));
        }

        s = "";
        while(!st.isEmpty()){
            s = st.pop()+s;
        }
        return s;
    }
}