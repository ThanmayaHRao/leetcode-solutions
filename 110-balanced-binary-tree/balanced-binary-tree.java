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
    int out = 1;
    public int height(TreeNode root){
        if(root == null)return 0;

        int lh = height(root.left);
        int rh = height(root.right);
        int res = Math.abs(lh-rh);
        if(res>1){
            out = 0;
        } 
        return Math.max(lh,rh)+1;
       
    }

    public boolean isBalanced(TreeNode root) {
        height(root);
        if(out == 0) return false;
        else return true;
    }
}
