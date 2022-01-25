import java.util.ArrayList;
import java.util.List;

public class Q257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        helper(root, "", result);
        return result;
    }

    public void helper(TreeNode root, String str, List<String> result){

        if(root.left==null && root.right==null){
            str=str+root.val;
            result.add(str);
            return;
        }

        str=str+root.val;
        str=str+"->";

        helper(root.left,str,result);
        helper(root.right,str,result);

        return;
    }
}
