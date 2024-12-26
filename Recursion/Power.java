package Recursion;
//Calculate the power of x (x^n)
public class Power {
    //Time Complexity - O(n)
    public static int pow(int x,int n){
        if(n == 0){ //Base case
            return 1;
        }
        return x*pow(x,n-1);
    }
    //Time complexity - O(log n)
    public static int powOptimised(int x,int n){
        if(n == 0){
            return 1;
        }
        if(n % 2 == 0){
            return powOptimised(x, n/2)*powOptimised(x, n/2);
        } else{
            return x*powOptimised(x, n/2)*powOptimised(x, n/2);
        }
    }
    public static void main(String[] args) {
        int x = 4,n = 5;
        System.out.println(pow(x,n));
        System.out.println(powOptimised(x,n));
    }
}
