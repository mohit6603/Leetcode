class Solution {
    public boolean isValid(String s) {
        char ch[] = s.toCharArray();

        Stack<Character> stack = new Stack<>();
        for(char c : ch){
            if(c == '[' || c == '{' || c == '('){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else if((c == ']' && stack.peek() == '[') || (c == '}' && stack.peek() == '{') || (c == ')' && stack.peek() == '(')){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }

        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}