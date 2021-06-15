public class Q236 {
    /*
    travel the whole tree recursively from the root
    if the current node contain both p and q it is their LCA
    if the current node is p or q then LCA is p or q
    if both are not in that subtree then return null
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left == null && right == null) {
            return null;
        }
        if(left != null && right != null){
            return root;
        }
        if(left==null){
            return right;
        }else{
            return left;
        }
    }
}
