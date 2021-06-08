import java.util.Arrays;

public class Q105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder,0,inorder.length-1,0);
    }
    public TreeNode build(int[] preorder,int [] inorder,int in_begin,int in_end,int pre_begin){
        if(in_begin>in_end)
            return null;
        TreeNode root = new TreeNode(preorder[pre_begin]);
        if(in_begin==in_end)
            return root;
        int index = in_end;  // find the index of root in inorder
        while(inorder[index]!=root.val){
            index--;
        }
        root.left = build(preorder,inorder,in_begin,index-1,pre_begin+1);
        root.right = build(preorder,inorder,index+1,in_end,pre_begin+1+(index-in_begin));
        return root;

    }
}
