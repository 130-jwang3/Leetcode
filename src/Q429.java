import java.util.ArrayList;
import java.util.List;
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
public class Q429 {
    public List<List<Integer>> levelOrder(Node root) {
        return travel(root,0,new ArrayList<>());
    }
    private List<List<Integer>> travel(Node root, int level, List<List<Integer>> container){
        if(root==null){
            return container;
        }
        if(container.size()<level+1){
            container.add(level,new ArrayList<Integer>());
        }
        container.get(level).add(root.val);
        for(Node child:root.children){
            travel(child,level+1,container);
        }
        return container;
    }
}
