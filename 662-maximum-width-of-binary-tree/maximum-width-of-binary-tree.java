import java.util.LinkedList;
import java.util.Queue;

class Solution {
    class NodePosition {
        TreeNode node;
        int position;

        NodePosition(TreeNode node, int position) {
            this.node = node;
            this.position = position;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        Queue<NodePosition> q = new LinkedList<>();
        int max = 0;
        q.offer(new NodePosition(root, 1));
        while (!q.isEmpty()) {
            int size = q.size();
            int first = 0;
            int last = 0;
            for (int i = 0; i < size; i++) {
                NodePosition nn = q.poll();
                TreeNode node = nn.node;
                int pos = nn.position;
                if (i == 0)
                    first = pos;
                if (i == size - 1)
                    last = pos;
                if (node.left != null) {
                    int npos = (2 * pos);
                    q.offer(new NodePosition(node.left, npos));
                }
                if (node.right != null) {
                    int npos = 2 * pos + 1;
                    q.offer(new NodePosition(node.right, npos));
                }
            }
            max = Math.max(max, last - first + 1);
        }
        return max;
    }
}
