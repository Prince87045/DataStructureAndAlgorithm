package Recursion;
//Print sum of first n natural number
public class SumNatural {
    public static int sum(int n){
        if(n == 1){//Base Case
            return 1;
        }
        int sum = n + sum(n-1);
        return sum;
    }
    public static void main(String[] args) {
        int n=20;
        System.out.println(sum(n));
    }
}
