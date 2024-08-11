class Trie {

    Node root;
    public Trie() {
        root = new Node();
    }
    public void insert(String word) {
        root.add(word);
    }
    public boolean search(String word) {
        return root.find(word);
    }
    public boolean startsWith(String word) {
        return root.startsWith(word, 0);
    }
    
    //trie ka implementation
    class Node{
        Node[] ref;
        boolean eow;

        Node(){
            ref = new Node[26];
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
                curr  = curr.ref[idx];
            }
            //return (curr.eow == true) ? true : false;
            //return curr.eow == true;
            return curr.eow;
        }

        private boolean startsWith(String prefix, int idx){
            if(idx >= prefix.length()) return false;
            Node curr = root;
            curr = ref[prefix.charAt(idx)-'a'];

            if(curr == null) return false;
            if(idx == prefix.length() -1) return true;

            return curr.startsWith(prefix, idx+1);
        }
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */