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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return build(preorder,inorder,0,inorder.length-1,0,preorder.length-1,map);
    }
    public TreeNode build(int[] pre,int[]in ,int instr,int inend,int prestr, int preend,HashMap<Integer,Integer> map){
            if(prestr>preend || instr>inend) return null;
            TreeNode root=new TreeNode(pre[prestr]);
            int index=map.get(pre[prestr]);
            root.left=build(pre,in,instr,index-1,prestr+1,prestr+(index-instr),map);
            root.right=build(pre,in,index+1,inend,prestr+(index-instr)+1,preend,map);
            return root;
    }
}