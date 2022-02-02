import java.util.Arrays;

public class Q654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return builder(nums,0,nums.length-1);
    }
    private TreeNode builder(int[] nums, int start, int end){
        if(start>end){
            return null;
        }
        int max=Integer.MIN_VALUE;
        int index=start;
        for(int i=start;i<=end;i++){
            if(max<nums[i]){
                max=nums[i];
                index=i;
            }
        }
        TreeNode root=new TreeNode(max);
        root.left=builder(nums,start,index-1);
        root.right=builder(nums,index+1,end);
        return root;
    }
}
