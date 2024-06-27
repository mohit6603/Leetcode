class MyStack {

    List<Integer> al ;
    public MyStack() {
        al = new ArrayList<>(); 
    }
    
    public void push(int x) {
        al.add(x);
    }
    
    public int pop() {
        return al.remove(al.size()-1);
    }
    
    public int top() {
        return al.get(al.size()-1);
    }
    
    public boolean empty() {
        return al.size() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */