public class Q114 {
    /*
    since the desired final flatten tree is in post order
    1.do a post order travel through the tree
    2.set the right to be the parent root and left to be null
    3.set the current node be the next prev node
     */
    private TreeNode prev=null;
    public void flatten(TreeNode root) {
        if (root == null)
            return;
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }
}
