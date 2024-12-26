package Recursion;
//Calculate the power of x (x^n)
//Time Complexity - O(n)
public class Power {
    public static int pow(int x,int n){
        if(n == 0){ //Base case
            return 1;
        }
        return x*pow(x,n-1);
    }
    public static void main(String[] args) {
        int x = 2,n = 5;
        System.out.println(pow(x,n));
    }
}
