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
    public int maxAncestorDiff(TreeNode root) {
        if (root==null) return 0;
        return maxDif(root,Integer.MAX_VALUE, Integer.MIN_VALUE);
    }
    int maxDif(TreeNode root, int min, int max) {
        if (root==null) return Math.abs(min-max);
        min = Math.min(min, root.val);
        max = Math.max(max, root.val);
        return Math.max(maxDif(root.left,min,max),maxDif(root.right,min,max));
    }
}