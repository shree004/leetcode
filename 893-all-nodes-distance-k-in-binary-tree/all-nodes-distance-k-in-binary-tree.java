/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void parent_track(TreeNode root, Map<TreeNode, TreeNode> map) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                if (cur.left != null) {
                    map.put(cur.left, cur);
                    q.offer(cur.left);
                }
                if (cur.right != null) {
                    map.put(cur.right, cur);
                    q.offer(cur.right);
                }
            }
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode> parentmap=new HashMap<>();
        parent_track(root,parentmap);
        Queue<TreeNode> q=new LinkedList<>();
        Map<TreeNode,Boolean> visited=new HashMap<>();
        q.offer(target);
        visited.put(target,true);
        List<Integer> ans=new ArrayList<>();
        int level=0;
        while(!q.isEmpty() && level<k){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                if(node.left!=null && visited.get(node.left)==null){
                    q.offer(node.left);
                    visited.put(node.left,true);
                }
                if(node.right!=null && visited.get(node.right)==null){
                    q.offer(node.right);
                    visited.put(node.right,true);
                }
                if(parentmap.get(node)!=null && visited.get(parentmap.get(node))==null){
                    q.offer(parentmap.get(node));
                    visited.put(parentmap.get(node),true);
                }
            }
            level++;
        }
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            ans.add(node.val);
        }
        return ans;
    }
}