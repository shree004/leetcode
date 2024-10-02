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
        int left=Math.max(0,sum(root.left,sum));
        int right=Math.max(0,sum(root.right,sum));
        sum[0]=Math.max(left+right+root.val,sum[0]);
        return Math.max(root.val+left,root.val+right);
    }
}