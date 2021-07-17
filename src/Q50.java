public class Q50 {
    /*
    1.if power is 0 return 1
    2.if power is divisible by 2 use recursion to multiply itself 2 times every time
    3.if not use recursion to multiply itself 2 time everytime until there is one more power left
        3.1 if power is positive multiply total by power
        3.2 else multiply total by 1/power
    4.return total;
     */
    public double myPow(double x, int n) {
        double temp=x;
        if(n==0){
            return 1;
        }
        temp=myPow(x,n/2);
        if(n%2==0){
            return temp*temp;
        }else{
            if(n > 0){
                return x*temp*temp;
            }else{
                return (temp*temp)/x;
            }
        }
    }
}
