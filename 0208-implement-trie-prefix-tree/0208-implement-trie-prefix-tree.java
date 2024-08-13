class Trie {

    Node root;
    public Trie() {
        root = new Node();
    }

    class Node{
        Node ref[] = new Node[26];
        boolean eow;

        public Node(){
            eow = false;
        }

        private void add(String word){
        Node curr = root;

        for(int i = 0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';

            if(curr.ref[idx] == null){
                curr.ref[idx] = new Node();
            }
            curr = curr.ref[idx];
        }
        curr.eow = true;
    }

    private boolean find(String word){
        Node curr = root;

        for(int i = 0; i<word.length(); i++){

            int idx = word.charAt(i) - 'a';
            if(curr.ref[idx] == null){
                return false;
            }

            curr = curr.ref[idx];
        }

        return curr.eow;
    }

    private boolean startWith(String prefix){
        Node curr = root;

        for(int i = 0; i<prefix.length(); i++){

            int idx = prefix.charAt(i) - 'a';

            if(curr.ref[idx] == null) return false;
            curr = curr.ref[idx];
        }
        return true;
    }
    }
    
    public void insert(String word) {
        root.add(word);
    }
    
    public boolean search(String word) {
        return root.find(word);
    }
    
    public boolean startsWith(String prefix) {
        return root.startWith(prefix);
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */