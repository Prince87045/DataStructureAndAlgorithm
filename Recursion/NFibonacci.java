package Recursion;
//Print Nth Fibonacci number
//Time complexity - O(2^n)
public class NFibonacci {
    public static int fibonacci(int n){
        if(n == 0 || n == 1){//Base Case
            return n;
        }
        int fib = fibonacci(n-1) + fibonacci(n-2);
        return fib;
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(fibonacci(n));
    }
}
