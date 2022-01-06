import java.util.Arrays;

public class Q977 {
    //first attempt:(runtime:3ms,memory:53.1MB)
    //        int i;
    //        for(i=0;i<nums.length;i++){
    //            nums[i]=Math.abs(nums[i]);
    //            nums[i]*=nums[i];
    //        }
    //        Arrays.sort(nums);
    //        return nums;
    //technic:brute force
    //second attempt:(runtime:1ms,memory:53.1MB)
    //technic: set 2 pointer left right and order the squared number into a new array from biggest to smallest
    public int[] sortedSquares(int[] nums) {
        int[] result=new int[nums.length];
        int left=0,right=nums.length-1;
        int i=nums.length-1;
        while(left<=right){
            int a=nums[left]*nums[left];
            int b=nums[right]*nums[right];
            if(a<b){
                result[i]=b;
                right--;
            }else{
                result[i]=a;
                left++;
            }
            i--;
        }
        return result;
    }
}
