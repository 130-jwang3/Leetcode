import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q150 {
    List<String> operators=new ArrayList<>();
    public int evalRPN(String[] tokens) {
        operators.add("+");
        operators.add("-");
        operators.add("*");
        operators.add("/");
        Stack<Integer> result=new Stack<>();
        for(String token:tokens){
            if(operators.contains(token)){
                int num1=result.pop();
                int num2=result.pop();
                int res=calculate(num1,num2,token);
                result.push(res );
            }else{
                result.push(Integer.parseInt(token));
            }
        }
        return result.pop();
    }
    public int calculate(int num1,int num2,String token){
        if(token.equals("+")){
            return num1+num2;
        }else if(token.equals("-")){
            return num2-num1;
        }
        else if(token.equals("*")){
            return num1*num2;
        }
        else if(token.equals("/")){
            return num2/num1;
        }
        return 0;
    }
}
