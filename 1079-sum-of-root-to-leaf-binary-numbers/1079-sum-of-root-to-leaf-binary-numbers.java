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
    int ans = 0;
    public int sumRootToLeaf(TreeNode root) {
        helper(root, "");
        return ans;
    }

    public void helper(TreeNode root, String s){
        if(root.left == null && root.right == null){
            s += root.val;
            ans += Integer.parseInt(s, 2);
            return;
        }

        if(root.left != null){
            helper(root.left, s+root.val);
        }

        if(root.right != null){
            helper(root.right, s+root.val);
        }
    }
}