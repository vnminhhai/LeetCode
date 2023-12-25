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
    public List<Integer> preorderTraversal(TreeNode root) {
        list= new ArrayList<>();
        preTraverseToList(root, list);
        return list;
    }
    void preTraverseToList(TreeNode n, List<Integer> list) {
        if (n==null) return;
        list.add(n.val);
        preTraverseToList(n.left,list);
        preTraverseToList(n.right,list);
    }
}