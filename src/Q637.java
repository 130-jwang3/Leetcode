import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Q637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offerLast(root);
        while (!queue.isEmpty()) {
            TreeNode peek = queue.peekFirst();
            int size = queue.size();
            double sum = 0.0;
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.pollFirst();
                sum += poll.val;
                if (poll.left != null) {
                    queue.addLast(poll.left);
                }
                if (poll.right != null) {
                    queue.addLast(poll.right);
                }
            }
            list.add(sum / size);
        }
        return list;
    }
}
