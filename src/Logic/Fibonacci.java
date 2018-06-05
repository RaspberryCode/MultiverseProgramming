package Logic;

public class Fibonacci {

    public int fibonacciRecursive( int n )
    {
        if (n <= 1)
            return n;
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    public int fibonacciDynamic ( int n )
    {
        if(n <= 1)
            return n;

        int f[] = new int[n+2];
        int i;

        f[0] = 0;
        f[1] = 1;

        for (i = 2; i <= n; i++)
            f[i] = f[i-1] + f[i-2];

        return f[n];
    }

    public int fibonacciWithOutIf ( int n ) {
        if(n <= 1)
            return n;
        int f = 0;
        int g = 1;

        for(int i = 1; i <= n; i++)
        {
            f += g;
            g = f - g;
        }

        return f;
    }
}
