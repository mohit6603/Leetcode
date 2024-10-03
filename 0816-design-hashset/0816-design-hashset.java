class MyHashSet {
    boolean ans[];
    int size = 1000001;
    public MyHashSet() {
        ans = new boolean[size];
        Arrays.fill(ans, false);
    }
    
    public void add(int key) {
        ans[key] = true;
    }
    
    public void remove(int key) {
        ans[key] = false;
    }
    
    public boolean contains(int key) {
        return ans[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */