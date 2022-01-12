import java.util.HashSet;
import java.util.Set;

public class Q202 {
    private int getSum(int n){
        int result=0;
        while(n>0){
            int temp=n%10;
            result+=temp*temp;
            n=n/10;
        }
        return result;
    }
    public boolean isHappy(int n) {
        int sum=getSum(n);
        Set<Integer> container=new HashSet<>();
        while(sum!=1){
            if(container.contains(sum)){
                return false;
            }else{
                container.add(sum);
            }
            sum=getSum(sum);
        }
        return true;
    }
}
