public class Q209 {
    //runtime:1ms, Memory Usage:38.9MB
    //time complexity:O(n)
    //space complexity:O(1)
    //method: set 2 pointer at the start of the array and move one pointer forward while adding up the variable in the
    //array, if the total sum>=target check if the length of the array between 2 pointers is minimum and move the second
    //pointer forward by one position.
    public int minSubArrayLen(int target, int[] nums) {
        int left=0,right=0;
        int total=0;
        int result=Integer.MAX_VALUE;
        for(right=0;right< nums.length;right++){
            total+=nums[right];
            while(total>=target){
                result=Integer.min(result,right-left+1);
                total-=nums[left];
                left++;
            }
        }
        if(result==Integer.MAX_VALUE){
            return 0;
        }else{
            return result;
        }
    }
}
