public class Q704 {
    //binary search, search for a target in an ordered array of variables
    //restriction: array have to be in order and there should not be any repeated number in the array
    //runtime:O(logn)
    //method:
    /* 1.set left pointer to 0 and right pointer to array.length-1
     * 2.find the middle variable of left and right pointer, check if target is bigger, equal, or smaller than the variable
     *  2.1.if the target is smaller, set right pointer to middle-1 and repeat step 2
     *  2.2.if the target is bigger, set left pointer to middle+1 and repeat step 2
     *  2.3.if the target equals middle variable, return middle position
     * 3.if the array does not contain target return -1
     */
    public int search(int[] nums, int target) {
        int mid,left=0,right=nums.length-1;
        while(left<=right){
            mid=left+(right-left)/2;
            if(nums[mid]==target) return mid;
            if(target<nums[mid]){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return -1;
    }
}
