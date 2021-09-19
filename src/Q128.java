import java.util.Arrays;

public class Q128 {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int temp = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                if (nums[i] == nums[i-1]+1) {
                    count += 1;
                }
                else {
                    temp = Math.max(temp, count);
                    count = 1;
                }
            }
        }

        return Math.max(temp, count);
    }
}
