package Recursion;
//find the length of string using recursion
public class StringLength {
    public static int length(String str){
        if(str.length() == 0){ //Base Case
            return 0;
        }
        return length(str.substring(1))+1;
    }
    public static void main(String[] args) {
        String str = "prince  ";
        System.out.println(length(str));
    }
}
