public class Q62 {
    /*
    simple math
    the total unique path is (m+n-2)!/(m-1)!(n-1)!
     */
    public int uniquePaths(int m, int n) {
        int c = m + n - 2;
        int p = Math.min(m, n) - 1;
        long num = 1;
        long deno = 1;
        for (int i=0; i<p; i++) {
            num *= c - i;
            deno *= i + 1;
        }
        return (int) (num / deno);
    }
}
