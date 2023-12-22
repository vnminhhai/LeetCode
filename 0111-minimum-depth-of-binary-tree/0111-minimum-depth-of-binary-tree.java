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
    public int minDepth(TreeNode root) {
        if (root==null) return 0;
        return min_dep(root,0);
    }
    int min_dep(TreeNode n, int l) {
        if (n.left!=null&&n.right!=null)
            return Math.min(min_dep(n.left,l+1),min_dep(n.right,l+1));
        if (n.left==null&&n.right==null) return l+1;
        if (n.left==null) return min_dep(n.right, l+1);
        else return min_dep(n.left, l+1);
    }
}