import java.util.ArrayDeque;

public class Q1047 {
    public String removeDuplicates(String s) {
        ArrayDeque<Character> deque = new ArrayDeque<>();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (deque.isEmpty() || deque.peek() != ch) {
                deque.push(ch);
            } else {
                deque.pop();
            }
        }
        String str = "";
        while (!deque.isEmpty()) {
            str = deque.pop() + str;
        }
        return str;
    }
}
