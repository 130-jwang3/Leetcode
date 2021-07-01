public class Q623 {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {

        if(depth==1){
            TreeNode node=new TreeNode(val);
            node.left=root;
            return node;
        }
        dfs(root,val,depth,1);
        return root;
    }
    private void dfs(TreeNode root,int val,int depth,int currentDepth){
        if(root==null){
            return;
        }if(currentDepth+1<depth){
            dfs(root.left,val,depth,currentDepth+1);
            dfs(root.right,val,depth,currentDepth+1);
        }else{
            TreeNode temp=root.left;
            root.left=new TreeNode(val);
            root.left.left=temp;
            temp=root.right;
            root.right=new TreeNode(val);
            root.right.right=temp;
        }
    }
}
