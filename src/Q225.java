import java.util.PriorityQueue;
import java.util.Queue;

public class Q225 {

    class MyStack {
        Queue<Integer> s1=new PriorityQueue<>();
        Queue<Integer> s2=new PriorityQueue<>();
        int head;
        public MyStack() {
            head=0;
        }

        public void push(int x) {
            s1.add(x);
            head=x;
        }

        public int pop() {
            for(int i=0;i<s1.size()-2;i++){
                s2.add(s1.poll());
            }
            int result=head;
            if(s1.size()==2){
                head=s1.poll();
            }else if(s1.size()<2){
                s1.poll();
                head=0;
            }
            while(!s2.isEmpty()){
                s1.add(s2.poll());
            }
            return result;
        }

        public int top() {
            return head;
        }

        public boolean empty() {
            return s1.isEmpty();
        }
    }
}
