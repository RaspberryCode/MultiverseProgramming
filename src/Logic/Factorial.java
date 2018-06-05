package Logic;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class Factorial {

    public static long factorialRecursive( long n )
    {
        if(n == 0) return 0;
        return n == 1 ? 1 : n * factorialRecursive( n-1 );
    }

    public static long factorialIterative ( long n )
    {
        if(n == 0) return 0;
        long r = 1;
        for ( long i = 1; i <= n; i++ )
        {
            r*=i;
        }
        return r;
    }


    public static long factorialStreams( long n )
    {
        if(n == 0) return 0;
        return LongStream.rangeClosed( 1, n )
                .reduce(1, ( long a, long b ) -> a * b);
    }
}
