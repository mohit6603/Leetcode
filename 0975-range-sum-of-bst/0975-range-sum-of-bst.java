/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    ArrayList<Integer> al = new ArrayList<>();
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0;
        helper(root);

        int sum = 0;
        for(int i = 0; i<al.size(); i++){
            if(al.get(i) >= low && al.get(i) <= high){
                sum += al.get(i);
            }
        }
        return sum;
    }

    public void helper(TreeNode root){
        if(root == null) return;

        al.add(root.val);
        helper(root.left);
        helper(root.right);
    }
}