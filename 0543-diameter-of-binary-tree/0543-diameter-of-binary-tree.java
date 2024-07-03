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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;

        //diam
        int ld = diameterOfBinaryTree(root.left);
        int rd = diameterOfBinaryTree(root.right);


        //heigth
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh+rh+2, Math.max(ld, rd));
    }

    public int height(TreeNode root){
        if(root == null) return -1;

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh)+1;
        
    }
}