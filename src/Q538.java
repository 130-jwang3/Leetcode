public class Q538 {
    /*
    1.have a global int to keep track of the sum bigger than the node.val
    2.use recursion to travel the bst from right to left
    for each node add it to the global int and add the global sum to the current node
     */
    private int sum=0;
    public TreeNode convertBST(TreeNode root) {
        if(root!=null){
            convertBST(root.right);
            sum+=root.val;
            root.val=sum;
            convertBST(root.left);
        }
        return root;
    }
}
