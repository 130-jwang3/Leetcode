public class Q404 {
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {

        if(root==null) {
            return 0;
        }
        if(root.left!=null){
            if(root.left.left==null && root.left.right==null) {
                sum = sum + root.left.val;
            }
        }
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);
        return sum;
    }
}
