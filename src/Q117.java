public class Q117 {
    private class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
    public Node connect(Node root){
        connectNode(root);
        return root;
    }
    public void connectNode(Node root){
        if (root == null){
            return;
        }
        if (root.left != null){
            if (root.right != null) {
                root.left.next = root.right;
            }else{
                root.left.next = findNext(root.next);
            }
        }
        if (root.right != null) {
            root.right.next = findNext(root.next);
        }
        connectNode(root.right);
        connectNode(root.left);
    }
    public Node findNext(Node root){
        while (root != null){
            if (root.left != null) {
                return root.left;
            }
            if (root.right != null) {
                return root.right;
            }
            root = root.next;
        }
        return null;
    }
}
