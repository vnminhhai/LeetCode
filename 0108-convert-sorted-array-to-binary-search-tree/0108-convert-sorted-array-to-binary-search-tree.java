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
    public TreeNode sortedArrayToBST(int[] nums) {
        return build (nums, 0, nums.length);
    }
    TreeNode build(int[] nodes, int from, int to) {
        if (from>to) return null;
        int mid= (from+to)/2;
        if (mid>=nodes.length||mid<0) return null;
        TreeNode n = new TreeNode(nodes[mid]);
        n.left = build(nodes, from, mid-1);
        n.right= build(nodes, mid+1, to);
        return n;
    }
}