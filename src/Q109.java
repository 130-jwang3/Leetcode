public class Q109 {
    /*
    since the list is ordered from smallest to largest find the start and end of list and use divide and conquer
    to sort the list into a BST
    1.find the size of list
    2.use a separate function to find the midpoint of list and set the Treenode to be the point and goes on
    3.use the same function on the left half of midpoint and the right half of the midpoint
    4.return the root(mid of list) Treenode
     */
    private ListNode node;
    public TreeNode sortedListToBST(ListNode head) {
        ListNode temp=head;
        node=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        return turnToBST(0,size-1);
    }
    private TreeNode turnToBST(int head,int tail){
        if(head > tail){
            return null;
        }

        int mid = head + (tail - head) / 2;
        TreeNode left = turnToBST(head, mid - 1);

        TreeNode node1 = new TreeNode(node.val);
        node1.left = left;
        node = node.next;

        TreeNode right = turnToBST(mid + 1, tail);
        node1.right = right;
        return node1;
    }
}
