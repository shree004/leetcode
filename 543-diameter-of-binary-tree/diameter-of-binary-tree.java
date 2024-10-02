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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int[] dia=new int[1];
        dia[0]=0;
        int a=diameter(root,dia);
        return dia[0];
    }
    public int diameter(TreeNode root,int[] dia){
        if(root==null) return 0;
        int left=diameter(root.left,dia);
        int right=diameter(root.right,dia);
        dia[0]=Math.max(dia[0],left+right);
        return Math.max(left,right)+1;
    }
}