import java.util.Arrays;

public class Q106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length==0){
            return null;
        }
        int root=postorder[postorder.length-1];
        int pos=0;
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==root){
                pos=i;
                break;
            }
        }
        int[] leftin= Arrays.copyOfRange(inorder,0,pos);
        int[] rightin= Arrays.copyOfRange(inorder,pos+1,inorder.length);
        int[] leftpos= Arrays.copyOfRange(postorder,0,pos);
        int[] rightpos= Arrays.copyOfRange(postorder,pos,inorder.length-1);
        TreeNode rootNode=new TreeNode(root);
        rootNode.left=buildTree(leftin,leftpos);
        rootNode.right=buildTree(rightin,rightpos);
        return rootNode;
    }
}
