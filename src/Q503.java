import java.util.*;

public class Q503 {
    int max = 0;
    int count = 0;
    int previous = 0;
    ArrayList<Integer> res = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        traverse(root);
        int[] result = new int[res.size()];
        for(int i=0;i<result.length;i++){
            result[i]=res.get(i);
        }
        return result;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(root.left);
        if (previous == root.val) {
            count++;
        } else {
            previous = root.val;
            count = 1;
        }
        if (count > max) {
            max = count;
            res.clear();
            res.add(root.val);
        } else if (count == max) {
            res.add(root.val);
        }
        traverse(root.right);
    }
}
