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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> a = new ArrayList<>();
        traverse(a, root);
        return a;
    }
    void traverse(List l, TreeNode n) {
        if(n!=null) {
        traverse(l, n.left);
        l.add(n.val);
        traverse(l, n.right);}
    }
}