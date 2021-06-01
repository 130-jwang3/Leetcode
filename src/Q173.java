import java.util.Stack;

public class Q173 {
    class BSTIterator{
        Stack<TreeNode> stack=new Stack<>();
        public BSTIterator(TreeNode root) {
            add(root);
        }

        public int next() {
            TreeNode node = stack.pop();
            add(node.right);
            return node.val;
        }

        public boolean hasNext() {
            return !stack.isEmpty();
        }
        private void add(TreeNode node) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }
    }

}
