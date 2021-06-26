import java.util.ArrayList;
import java.util.List;

public class Q515 {
    public List<Integer> largestValues(TreeNode root) {
        return travel(root,0,new ArrayList<Integer>());
    }
    private List<Integer> travel(TreeNode root,int level,  List<Integer> container){
        if(root==null){
            return container;
        }
        if(container.size()<level+1){
            container.add(level,root.val);
        }else{
            container.set(level,Math.max(root.val,container.get(level)));
        }
        travel(root.left,level+1,container);
        travel(root.right,level+1,container);
        return container;
    }
}
