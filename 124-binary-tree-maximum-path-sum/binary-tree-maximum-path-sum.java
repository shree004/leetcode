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
    public int maxPathSum(TreeNode root) {
        int[] sum=new int[1];
        sum[0]=Integer.MIN_VALUE;
        sum(root,sum);
        return sum[0];
    }
    public int sum(TreeNode root,int[] sum){
        if(root==null) return 0;
        int left=sum(root.left,sum);
        int right=sum(root.right,sum);
        if(left<0) left=0;
        if(right<0)right=0;
        sum[0]=Math.max(left+right+root.val,sum[0]);
        return Math.max(root.val+left,root.val+right);
    }
}