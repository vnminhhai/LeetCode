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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<TreeNode> a = new ArrayList<>(), b = new ArrayList<>();
        a.add(p);
        b.add(q);
        while (true) {
            if (a.isEmpty()||b.isEmpty()) break;
            TreeNode t1 = a.remove(0), t2 = b.remove(0);
            if (t1==null&&t2==null) continue;
            if (t1==null||t2==null) return false;
            if (t1.val!=t2.val) return false;
            a.add(t1.left);
            a.add(t1.right);
            b.add(t2.left);
            b.add(t2.right);
        }
        return (a.isEmpty()&&b.isEmpty());
    }
}