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
    public boolean isBalanced(TreeNode root) {
        if (root==null) return true;
        int t=dep(root.left,0)-dep(root.right,0);
        if (t>1||t<-1) return false;
        else return isBalanced(root.left)&&isBalanced(root.right);
    }
    int dep(TreeNode n, int l) {
        if (n==null) return l;
        n.val=Math.max(dep(n.left,l+1),dep(n.right,l+1));
        return n.val;
    }
}