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
class Tuple{
    TreeNode node;
    int x,y;
    public Tuple(TreeNode node,int x, int y){
        this.node=node;
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        if(root==null) return new ArrayList<>();
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        Queue<Tuple> q=new LinkedList<>();
        q.offer(new Tuple(root,0,0));
        while(!q.isEmpty()){
            Tuple tuple=q.poll();
            TreeNode node=tuple.node;
            int x=tuple.x;
            int y=tuple.y;
            if(!map.containsKey(x)) map.put(x,new TreeMap<>());
            if(!map.get(x).containsKey(y)) map.get(x).put(y,new PriorityQueue<>());
            map.get(x).get(y).offer(node.val);
            if(node.left!=null) q.offer(new Tuple(node.left,x-1,y+1));
            if(node.right!=null) q.offer(new Tuple(node.right,x+1,y+1));
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> t: map.values()){
            List<Integer> list=new ArrayList<>();
            for(PriorityQueue<Integer> qs: t.values()){
                while(!qs.isEmpty()){
                    list.add(qs.poll());
                }
            }
            ans.add(list);
        }
        return ans;
    }
}