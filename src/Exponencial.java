public class Exponencial {
    public int fibonacciRecursivo(int n) {
    if (n <= 1) return n;
    return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2); 
    }

}
