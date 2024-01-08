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
    static int res;
    public int rangeSumBST(TreeNode root, int low, int high) {
        res=0;
        recurse(root, low, high);
        return res;
    }
    void recurse(TreeNode root, int low, int high) {
        if (root==null) return;
        if (root.val>=low&&root.val<=high) res+=root.val;
        recurse(root.left, low, high);
        recurse(root.right, low, high);
    }
}