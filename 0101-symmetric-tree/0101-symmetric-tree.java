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
    public boolean isSymmetric(TreeNode root) {
        if (root.left==null&&root.right==null) return true;
        if (root.left==null||root.right==null) return false;
        ArrayList<TreeNode> t1 =new ArrayList<>(), t2 =new ArrayList<>();
        t1.add(root.left);
        t2.add(root.right);
        while (!t1.isEmpty()&&!t2.isEmpty()) {
            TreeNode n1 = t1.remove(0), n2=t2.remove(0);
            if (n1==null&&n2==null) continue;
            if (n1==null||n2==null) return false;
            if (n1.val!=n2.val) return false;
            t1.add(n1.left);
            t1.add(n1.right);
            t2.add(n2.right);
            t2.add(n2.left);
        }
        return t1.isEmpty()&&t2.isEmpty();
    }
}