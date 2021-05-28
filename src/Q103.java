import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q103 {
    List<List<Integer>> result= new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        bfs(root,0);
        for(int i=0;i<result.size();i++){
            if(i%2==1){
                Collections.reverse(result.get(i));
            }
        }
        return result;
    }
    public void bfs(TreeNode root, int level){
        if(root==null){
            return;
        }
        if(result.size()==level){
            result.add(new ArrayList<>());
        }
        result.get(level).add(root.val);
        bfs(root.left,level+1);
        bfs(root.right,level+1);
    }
}
