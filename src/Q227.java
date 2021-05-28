import java.util.Stack;

public class Q227 {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int num = 0, res = 0;
        char sign = '+';
        char[] sArray = s.toCharArray();
        for(int i=0; i<sArray.length; i++) {
            char c = sArray[i];
            if(c >= '0' && c <= '9') {
                num = 10 * num + (c - '0');
            }
            if(c == '+' || c == '-' || c == '*' || c == '/' || i == sArray.length-1) {
                if(sign == '+' || sign == '-') {
                    int tmp = sign == '+' ? num : -num;
                    stack.push(tmp);
                    res += tmp;
                } else {
                    res -= stack.peek();
                    int tmp = sign == '*' ? stack.pop() * num : stack.pop() / num;
                    stack.push(tmp);
                    res += tmp;
                }
                sign = c;
                num = 0;
            }
        }
        return res;
    }
}
