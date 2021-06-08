public class Q98 {
    /*
    1.use recursion to travel to whole BST
    2.for each val check if it's left subnode is smaller then itself and right subnode is bigger then itself
    3.if yes return true and if no return false with minVal and maxVal
     */
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, Integer minVal, Integer maxVal) {
        if (root == null) return true;
        if (root.val >= maxVal || root.val <= minVal) return false;
        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
    }
}
