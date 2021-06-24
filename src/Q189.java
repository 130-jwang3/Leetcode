import java.util.Arrays;
import java.util.Collections;
/*
check how many rotate needed k%nums.length
reverse the whole array
then reverse from index 0 to k%nums.length-1
reverse from k%nums.length to end of array
 */
public class Q189 {
    public void rotate(int[] nums, int k) {
        change(nums,0,nums.length-1);
        change(nums,0,k%nums.length-1);
        change(nums,k%nums.length,nums.length-1);
    }
    private void change(int[] nums, int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
