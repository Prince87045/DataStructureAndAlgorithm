package Recursion;
//Print all binary strings of size N without consecutive ones
//example "0100101000"-allowed , "0110100"-not allowed
public class BinaryStrings {
    public static void printBinStrings(int n, int lastPlace, String str){
        if(n == 0){ //Base Case
            System.out.println(str);
            return;
        }
        //kaam
        // if(lastPlace == 0){
        //     //sit 0 on chair n           
        //     printBinStrings(n-1,0, str.append("0")); //Recursive function call
        //     printBinStrings(n-1,1, str.append("1"));
        // } else {           
        //     printBinStrings(n-1, 0, str.append("0"));
        // }
        printBinStrings(n-1,0, str + "0");
        if(lastPlace == 0){
            printBinStrings(n-1,1, str + "1");
        }
    }
    public static void main(String[] args) {
        int n = 3;
        int lastPlace = 0;
        printBinStrings(n, lastPlace, new String(""));
    }
}
