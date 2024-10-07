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
    public TreeNode buildTree(int[] inorder,int[] postorder) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return build(postorder,inorder,0,inorder.length-1,0,postorder.length-1,map);
    }
    public TreeNode build(int[] post,int[]in ,int instr,int inend,int poststr, int postend,HashMap<Integer,Integer> map){
            if(poststr>postend || instr>inend) return null;
            TreeNode root=new TreeNode(post[postend]);
            int index=map.get(post[postend]);
            root.right=build(post,in,index+1,inend,postend-(inend-index),postend-1,map);
            root.left=build(post,in,instr,index-1,poststr,postend-(inend-index)-1,map);
            return root;
    }
}