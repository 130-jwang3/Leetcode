import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k == 1) return nums;
        ArrayDeque<Integer> dequeue = new ArrayDeque<>();
        int[] result = new int[nums.length - k + 1];
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if(!dequeue.isEmpty() && (dequeue.peekFirst() == i - k)){
                dequeue.removeFirst();
            }
            while(!dequeue.isEmpty() && nums[dequeue.peekLast()] < nums[i]){
                dequeue.removeLast();
            }
            dequeue.offer(i);
            if(i >= k - 1){
                result[index] = nums[dequeue.peekFirst()];
                index++;
            }
        }
        return result;
    }
}
