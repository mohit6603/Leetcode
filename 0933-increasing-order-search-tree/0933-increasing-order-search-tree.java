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
    public TreeNode increasingBST(TreeNode root) {
        TreeNode result = new TreeNode();
        helper(root, result);
        return result.right;
    }

    private TreeNode helper(TreeNode root, TreeNode result){
        if(root == null) return result;
        result = helper(root.left, result);
        result.right = new TreeNode(root.val);
        result = helper(root.right, result.right);
        return result;
    }
}