import java.util.LinkedList;
import java.util.List;

public class Q145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result=new LinkedList<>();
        travel(result,root);
        return result;
    }
    private void travel(List<Integer>result, TreeNode root){
        if(root==null){
            return;
        }
        travel(result,root.left);
        travel(result,root.right);
        result.add(root.val);
    }
}
