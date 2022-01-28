import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q113 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer> storage = new ArrayList<Integer>();
        dfs(root,targetSum,result,storage,0);
        return result;
    }
    private void dfs(TreeNode root, int targetSum, List<List<Integer>>result, List<Integer>storage, int sum){
        if(root==null){
            return;
        }
        storage.add(root.val);
        sum+=root.val;
        if(root.left==null&&root.right==null&&sum==targetSum){
            result.add(new ArrayList<>(storage));
        }else{
            dfs(root.right,targetSum,result,storage,sum);
            dfs(root.left,targetSum,result,storage,sum);
        }
        storage.remove(storage.size()-1);
    }
}
