class Node {
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
/*
start from the root and travel down
1.set root.left.next==root.right
2.set root.right.next=root.next.left
3.travel to root.next and repeat step 1 and 2
4.from the root travel to its left node and repeat step 1 2, and 3
5.return root;
 */
public class Q116 {
    public Node connect(Node root) {
        Node root1=root;
        while(root1!=null){
            Node cur=root1;
            while(cur!=null){
                if(cur.left!=null) cur.left.next=cur.right;
                if(cur.right!=null && cur.next!=null) cur.right.next=cur.next.left;

                cur=cur.next;
            }
            root1=root1.left;
        }
        return root;
    }
}
