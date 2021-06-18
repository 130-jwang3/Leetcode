import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*
    used dfs to solve this
    1. start from root of tree as height 0
    2.if the return list does not contain the level of root add one list to return list
    3.add the root val to the list according to its height
    4.travel its left and right child until the whole tree has been recursed
 */
public class Q102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        levelHelper(result, root, 0);
        return result;
    }
    private void levelHelper(List<List<Integer>> result, TreeNode node, int height){
        if (node == null) return;
        if (height >= result.size()) {
            result.add(new LinkedList<Integer>());
        }
        result.get(height).add(node.val);
        levelHelper(result, node.left, height+1);
        levelHelper(result, node.right, height+1);
    }
}
