import java.util.*;

public class Q279 {
    public static int numSquares(int n) {
        int[] store=new int[n+1];
        Queue<Integer>queue=new LinkedList<>();
        for(int i=1;i*i<=n;i++){
            if(i*i==n){
                return 1;
            }
            store[i*i]=1;
            queue.offer(i*i);
        }
        while(!queue.isEmpty()){
            int current=queue.peek();
            for(int i=0;i*i+current<=n;i++){
                if(i*i+current==n){
                    return store[current]+1;
                }else if(i*i+current<n&&store[current+i*i]==0){
                    store[current+i*i]=store[current]+1;
                    queue.offer(current+i*i);
                }else if(i*i+current>n){
                    break;
                }
            }
            queue.poll();
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(numSquares(13));
    }
}
