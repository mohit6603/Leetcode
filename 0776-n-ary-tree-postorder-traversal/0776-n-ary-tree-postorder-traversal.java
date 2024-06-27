/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> al = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if(root == null) return al;
        helperPostorder(root);
        return al;
    }

    public void helperPostorder(Node root){
        if(root.children == null) return;
        for(Node child : root.children){
            helperPostorder(child);
        }
        al.add(root.val);
    }
}