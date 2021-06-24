public class Q129 {
    /*
    use recursion to travel the whole tree
    1.check if current node is null
        1.1 if yes return 0;
        1.2 if no check if both node.left and node.right is null
            1.2.1 if yes the total sum*10 + node.val
            1.2.2 if no recurse both left and right with the new sum = previous sum*10 +node.val
     */
    public int sumNumbers(TreeNode root) {
        return add(root,0);
    }
    private int add(TreeNode root,int sum){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return root.val+sum*10;
        }
        return add(root.left,root.val+sum*10)+add(root.right,root.val+sum*10);
    }
}
