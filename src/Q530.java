public class Q530 {
    int result=Integer.MAX_VALUE;
    int previous=Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        traverse(root);
        return result;
    }
    private void traverse(TreeNode root){
        if(root==null){
            return;
        }
        traverse(root.left);
        result=Math.min(result,Math.abs(root.val-previous));
        previous=root.val;
        traverse(root.right);
    }
}
