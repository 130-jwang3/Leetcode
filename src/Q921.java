import java.util.Stack;

public class Q921 {
    /*
    1.iterate through the string s
        1.1 if it's a left bracket int left++;
        1.2 if it's a right bracket
            1.2.1 if left bracket>0 left bracket--,continue
            1.2.2if left bracket<=0 right bracket ++
    2. return left+right
     */
    public int minAddToMakeValid(String s) {
        int left=0;
        int right=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                right++;
            } else if (right > 0) {
                right--;
            } else {
                left++;
            }
        }
        return left + right;
    }
}
