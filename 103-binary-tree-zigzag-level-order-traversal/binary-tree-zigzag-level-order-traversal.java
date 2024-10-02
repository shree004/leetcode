/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(root, 0, ans);
        for(int i=0;i<ans.size();i++){
            if(i%2==1) Collections.reverse(ans.get(i));
        }
        return ans;
    }

    public void helper(TreeNode root, int level, List<List<Integer>> ans) {
        if (root == null)
            return;
        if (level >= ans.size())
            ans.add(new ArrayList());
        ans.get(level).add(root.val);
        helper(root.left, level + 1, ans);
        helper(root.right, level + 1, ans);
    }
}