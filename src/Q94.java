import java.util.LinkedList;
import java.util.List;

public class Q94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new LinkedList<>();
        travel(result,root);
        return result;
    }
    private void travel(List<Integer>result, TreeNode root){
        if(root==null){
            return;
        }
        travel(result,root.left);
        result.add(root.val);
        travel(result,root.right);
    }
}
