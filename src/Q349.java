import java.util.HashSet;
import java.util.Set;

public class Q349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> container1=new HashSet<>()
        Set<Integer> container2=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            container1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(container1.contains(nums2[i])){
                container2.add(nums2[i]);
            }
        }
        int[]result=new int[container2.size()];
        int index=0;
        for(int i:container2){
            result[index]=i;
            index++;
        }
        return result;
    }
}
