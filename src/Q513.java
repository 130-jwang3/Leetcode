public class Q513 {
        int ans=0, height=0;
        /*
        use dfs to find the deepest tree node and then find the left node in the deepest level
         */
        public int findBottomLeftValue(TreeNode root) {
            findBottomLeftValue(root, 1);
            return ans;
        }
        public void findBottomLeftValue(TreeNode root, int depth) {
            if (height<depth) {ans=root.val;height=depth;}
            if (root.left!=null) findBottomLeftValue(root.left, depth+1);
            if (root.right!=null) findBottomLeftValue(root.right, depth+1);
        }
}
