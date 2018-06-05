package Logic;

public class MultiverseCalculation {


    public long factorial(long n){

        Factorial fac = new Factorial();
        long valRecursive = fac.factorialRecursive(n);
        long valIterative = fac.factorialIterative(n);
        long valStreams = fac.factorialStreams(n);

        if(valRecursive == valIterative || valRecursive == valStreams) return valRecursive;
        else if(valIterative == valStreams) return valIterative;
        else return 0;
    }

    public int fibonacci(int n) {
        Fibonacci fibb = new Fibonacci();
        int valRecursive = fibb.fibonacciRecursive(n);
        int valDynamic = fibb.fibonacciDynamic(n);
        int valWithOutIf = fibb.fibonacciWithOutIf(n);

        if(valRecursive == valDynamic || valRecursive == valWithOutIf) return valRecursive;
        else if(valDynamic == valWithOutIf) return valDynamic;
        else return 0;
    }
}
