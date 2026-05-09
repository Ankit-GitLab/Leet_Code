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
        // An empty tree is technically symmetric
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode t1, TreeNode t2) {
        // If both nodes are null, we've reached the end of a matching branch
        if (t1 == null && t2 == null) return true;
        
        // If only one is null, or the values don't match, it's not symmetric
        if (t1 == null || t2 == null) return false;
        if (t1.val != t2.val) return false;

        // Recursively check:
        // 1. Left of t1 vs Right of t2
        // 2. Right of t1 vs Left of t2
        return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }
}