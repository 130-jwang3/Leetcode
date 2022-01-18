import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;

public class Q144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result=new LinkedList<>();
        travel(result,root);
        return result;
    }
    private void travel(List<Integer>result, TreeNode root){
        if(root==null){
            return;
        }
        result.add(root.val);
        travel(result,root.left);
        travel(result,root.right);
    }
}
