public class Q287 {
    public int findDuplicate(int[] nums) {
        int left = 1, right = nums.length;
        while(left < right){
            int count = 0;
            int mid = left + (right-left)/2;
            for(int i=0;i<nums.length;i++) {
                if(nums[i] <= mid) count++;
            }
            if(count <= mid) {
                left = mid+1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
