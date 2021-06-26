class Node1 {
    public int val;
    public Node1 left;
    public Node1 right;
    public Node1 next;

    public Node1() {}

    public Node1(int _val) {
        val = _val;
    }

    public Node1(int _val, Node1 _left, Node1 _right, Node1 _next) {
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
    public Node1 connect(Node1 root) {
        Node1 root1=root;
        while(root1!=null){
            Node1 cur=root1;
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
