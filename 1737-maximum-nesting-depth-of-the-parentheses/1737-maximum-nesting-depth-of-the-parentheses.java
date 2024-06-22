class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int max = 0;
        Stack<Character> st = new Stack<>();

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                st.push(s.charAt(i));
                count++;
            }
            if(count > max) max = count;
            if(s.charAt(i) == ')'){
                st.pop();
                count--;
            }
        }
        return max;
    }
}