import java.util.ArrayList;
import java.util.Stack;

public class Q71 {
    /*
    1.split the input string into string array by delimiter "/"
    2.use for loop to push the array into stack
        2.1 if it is .. and stack is not empty pop
        2.2 if it is empty or one single dot does nothing
        2.3 else push it into stack
     3.pop stack and convert into string and return
     */
    public String simplifyPath(String path) {
        String[] paths = path.split("/");
        String[] stack = new String[paths.length];
        int ptr = 0;
        for(int i = 0; i < paths.length; i++){
            if(paths[i].equals(".") || paths[i].equals("")){
                continue;
            }else if(paths[i].equals("..")){
                if(ptr > 0) ptr--;
            }else{
                stack[ptr] = paths[i];
                ptr++;
            }
        }
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < ptr; i++){
            result.append("/");
            result.append(stack[i]);
        }
        return result.length() == 0 ? "/" : result.toString();
    }
}
