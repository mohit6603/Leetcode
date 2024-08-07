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
        helper(root, low, high);
        int ans = 0;
        for(int  i = 0; i<al.size(); i++){
            if(al.get(i) >= low && al.get(i) <= high){
                ans += al.get(i);
            }
        }
        return ans;

    }
    public void helper(TreeNode root, int low, int high){
        if(root == null) return;
        al.add(root.val);
        helper(root.left, low, high);
        helper(root.right, low, high);
    }
}