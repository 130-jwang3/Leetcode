public class Q96 {
    /*
    the number of unique bst is
    by equation:2n!/(n+1)!n!
     */
    public int numTrees( int n ) {
        return ( int )Math.round( factorial( 2 * n ) / ( factorial( 1 + n ) * factorial( n ) ) );
    }

    private double factorial( double n ) {
        if ( n <= 0 )
            return 1;
        return n * factorial( n - 1 );
    }
}
