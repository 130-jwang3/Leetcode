import java.util.ArrayList;
import java.util.List;

public class Q199 {
    /*
     *   1)traverse the tree from right to left instead of left to right
     *   2)use result.size()==level to make sure only the first element of the level will be added to the list
     *   hint: set List<Integer> result to the heap to minimize memory usage
     */
    List<Integer> result=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        rightView(root,0,result);
        return result;
    }
    public void rightView(TreeNode root,int level,List<Integer> result){
        if(root==null){
            return;
        }
        if(result.size()==level){
            result.add(root.val);
        }
        rightView(root.right,level+1,result);
        rightView(root.left,level+1,result);
    }
}
