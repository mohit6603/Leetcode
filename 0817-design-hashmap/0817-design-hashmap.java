class MyHashMap {
    List<Pair>[] bucket;
    int size=10000;
    static class Pair{
        int key;
        int value;

        Pair(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    public MyHashMap() {
        bucket = new LinkedList[size];
        for(int i = 0; i < size; i++){
            bucket[i] = new LinkedList<>();
        }
    }
    
    public void put(int key, int value) {
        int bcktNo = key%size;
        List<Pair> chain = bucket[bcktNo];

        for(Pair p : chain){
            if(p.key == key){
                p.value = value;
                return;
            }
        }
        chain.add(new Pair(key, value));
    }
    
    public int get(int key) {
        int bcktNo = key%size;
        List<Pair> chain = bucket[bcktNo];

        for(Pair p : chain){
            if(p.key == key){
                return p.value;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int bcktNo = key%size;
        List<Pair> chain = bucket[bcktNo];

        for(Pair p : chain){
            if(p.key == key){
                chain.remove(p);
                return ;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */