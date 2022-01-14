import java.util.Stack;

public class Q232 {
    class MyQueue {
        Stack<Integer> q1=new Stack<>();
        Stack<Integer> q2=new Stack<>();
        int head;
        public MyQueue() {
            head=0;
        }

        public void push(int x) {
            q1.push(x);
            if(q1.size()==1){
                head=x;
            }
        }

        public int pop() {
            while(!q1.isEmpty()){
                q2.push(q1.pop());
            }
            int result=q2.pop();
            while(!q2.isEmpty()){
                q1.push(q2.pop());
                if(q1.size()==1){
                    head=q1.peek();
                }
            }
            return result;
        }

        public int peek() {
            return head;
        }

        public boolean empty() {
            if(q1.isEmpty()){
                return true;
            }
            return false;
        }
    }
}
