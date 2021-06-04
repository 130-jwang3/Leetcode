import java.util.*;

public class Q454 {
    /*
    We aim to find all possible A[i] + B[j] + C[k] + D[l] = 0, that is,A[i] + B[j] = -(C[k] + D[l])
       1.find all possible sum of nums1 and nums2 put into hashmap
       2.find all possible sum of nums3 and nums4 put into hashmap
       3.if they add to zero res+1;
     */
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                int sum = nums1[i] + nums2[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        int res = 0;
        for(int i=0; i<nums3.length; i++){
            for(int j=0; j<nums4.length; j++){
                int sum = nums3[i] + nums4[j];
                res += map.getOrDefault(-sum, 0);
            }
        }

        return res;
    }
}
