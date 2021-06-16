import java.util.Arrays;

public class Q215 {
    /*
    1.sort the int array using array.sort
    2.return the array length-k index of the sorted array
     */
    public int findKthLargest(int[] nums, int k){
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
