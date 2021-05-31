import java.util.Stack;

public class Q1673 {
    /*
    1. use a stack to keep k number of integer
    2.traverse the int[], check if integer at int[i] is smaller than the stack
    3.if yes and stack.size()-1+int[].size()-i>=k pop the stack
    4.if stack don't have k element we push int[i] into stack
    5.return stack
     */
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> stack=new Stack<>();
        int[] result=new int[k];
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty()&&nums[i]<stack.peek()&&nums.length-i+stack.size()>k){
                stack.pop();
            }
            if(stack.size()<k){
                stack.push(nums[i]);
            }
        }
        int i=k-1;
        while(!stack.isEmpty()){
            result[i]=stack.pop();
            i--;
        }
        return result;
    }
}
