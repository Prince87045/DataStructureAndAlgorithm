package Recursion;

public class RecursionBasics {
    //Print number from n to 1 (decreasing order) using recursion
    public static void printDec(int n){
        if(n == 1){//Base Case
            System.out.println(n);
            return;
        }
        System.out.print(n+" "); //kaam
        printDec(n-1);  //inner function call
    }

    //Print number from 1 to n (increasing order) using recursion
    public static void printInc(int n){
        if(n == 1){//Base Case
            System.out.print(1+" ");
            return;
        }
        printInc(n-1);  //inner function call
        System.out.print(n+" "); //kaam
    }
    public static void main(String[] args) {
        int n = 10;
        printDec(n);
        printInc(n);
    }
}
