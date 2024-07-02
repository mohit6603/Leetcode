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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> mainList = new ArrayList<>();
        helper(root, mainList, 0);
        return mainList;
    }

    public void helper(TreeNode root, List<List<Integer>> mainList, int l){
        if(root == null)
        {
            return;
        }
        if(l == mainList.size())
        {
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            mainList.add(list);
        }
        else
        {
            mainList.get(l).add(root.val);
        }

        helper(root.left, mainList, l+1);
        helper(root.right, mainList, l+1);
    }
}