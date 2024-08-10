class Trie {
    Node root;

    public Trie() {
        root = new Node();
    }
    
    public void insert(String word) {
        root.put(word);
    }
    
    public boolean search(String word) {
        return root.find(word);
    }
    
    public boolean startsWith(String prefix) {
        return root.startsWith(prefix, 0);
    }

    class Node{
        Node[] children;
        boolean eow;

        Node(){
            children = new Node[26];
        }

        private void put(String word){
            Node curr = root;
            for(int level = 0; level < word.length(); level++){
                int idx = word.charAt(level) - 'a';

                if(curr.children[idx] == null){
                    curr.children[idx] = new Node();
                }
                curr = curr.children[idx];
            }

            curr.eow = true;
        }

        private boolean find(String word){
            Node curr = root;
            for(int level = 0; level < word.length(); level++){
                int idx = word.charAt(level) - 'a';
                if(curr.children[idx] == null){
                    return false;
                }

                curr  = curr.children[idx];
            }

            return curr.eow == true;
        }

        private boolean startsWith(String prefix, int idx){
            if(idx >= prefix.length()) return false;
            Node curr = root;
            curr = children[prefix.charAt(idx)-'a'];

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