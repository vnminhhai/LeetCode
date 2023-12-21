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
        if (dep(root)==-1) return false;
        return true;
    }
    int dep(TreeNode n) {
        if (n==null) return 0;
        int dl=dep(n.left), dr=dep(n.right);
        if (dl==-1||dr==-1) return -1;
        if (Math.abs(dl-dr)>1) return -1;
        return Math.max(dep(n.left),dep(n.right))+1;
    }
}