public class Q357 {
    /*
    n=0 1
    n=1 10
    n=2 10+9*9
    n=3 10+81+9*9*8=739
    n=4 10+81+648+9*9*8*7=4575
    .
    .
    .
     */
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int start = 10, base = 9;
        for (int i = 2; i <= n && i <= 10; i++) {
            base = base * (9 - i + 2);
            start += base;
        }
        return start;
    }
}
