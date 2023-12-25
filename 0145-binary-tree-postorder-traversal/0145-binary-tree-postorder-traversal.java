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
    static List<Integer> list;
    public List<Integer> postorderTraversal(TreeNode root) {
        list= new ArrayList<>();
        postTraverseToList(root, list);
        return list;
    }
    void postTraverseToList(TreeNode n, List<Integer> list) {
        if (n==null) return;
        postTraverseToList(n.left,list);
        postTraverseToList(n.right,list);
        list.add(n.val);
    }
}