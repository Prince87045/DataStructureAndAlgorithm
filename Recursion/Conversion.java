package Recursion;
//Convert a number to a String 2026 - "two zero two six";
public class Conversion {
    static String arr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void numToString(int num){
        if(num == 0){  //Base Case
            return;
        }
        int lastDigit = num%10;
        numToString(num/10);
        System.out.print(arr[lastDigit]+" ");
    }
    public static void main(String[] args) {
        int num = 5967;
        numToString(num);
    }
}
