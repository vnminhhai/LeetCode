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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Stack<TreeNode> current = new Stack<>();
        Stack<TreeNode> next = new Stack<>();
        if (root == null) return res;
        current.push(root);
        List<Integer> values= new ArrayList<>();
        while (!next.isEmpty()||!current.isEmpty()) {
            values= new ArrayList<>();
            while (!current.isEmpty()) {
                TreeNode n = current.pop();
                if (n.left!=null) next.push(n.left);
                if (n.right!=null) next.push(n.right);
                values.add(n.val);
            }
            res.add(values);
            if (next.isEmpty()) continue;
            values= new ArrayList<>();
            while (!next.isEmpty()) {
                TreeNode n = next.pop();
                if (n.right!=null) current.push(n.right);
                if (n.left!=null) current.push(n.left);
                values.add(n.val);
            }
            res.add(values);
        }
        return res;
    }
}