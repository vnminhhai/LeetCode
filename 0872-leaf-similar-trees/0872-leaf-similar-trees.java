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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayDeque<Integer> res= new ArrayDeque<>();
        ArrayDeque<TreeNode> q= new ArrayDeque<>();
        q.add(root1);
        do {
            TreeNode n=q.removeLast();
            if (n.left!=null || n.right!=null) {
                if (n.left!=null) q.addLast(n.left);
                if (n.right!=null) q.addLast(n.right);
            } else {
                res.addLast(n.val);
            }
        } while (!q.isEmpty());
        q.add(root2);
        do {
            TreeNode n=q.removeLast();
            if (n.left!=null || n.right!=null) {
                if (n.left!=null) q.addLast(n.left);
                if (n.right!=null) q.addLast(n.right);
            } else {
                if (res.isEmpty()) return false;
                if (res.removeFirst()!=n.val) return false;
            }
        } while (!q.isEmpty());
        return res.isEmpty();
    }
}