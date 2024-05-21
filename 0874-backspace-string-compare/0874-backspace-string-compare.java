class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> ss = new Stack<>();
        StringBuilder sss = new StringBuilder();
        Stack<Character> tt = new Stack<>();
        StringBuilder ttt = new StringBuilder();

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) != '#'){
                ss.push(s.charAt(i));
            }
            else{
                if(!ss.isEmpty()){
                    ss.pop();
                }
            }
        }

        for(int i = 0; i<t.length(); i++){
            if(t.charAt(i) != '#'){
                tt.push(t.charAt(i));
            }
            else{
                if(!tt.isEmpty()){
                    tt.pop();
                }
            }
        }

        while(!ss.isEmpty()){
            sss.append(ss.pop());
        }
        while(!tt.isEmpty()){
            ttt.append(tt.pop());
        }

        return sss.toString().equals(ttt.toString());
    }
}