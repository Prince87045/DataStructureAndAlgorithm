package Strings;
//Check if the given String is a palindrome or not
//Time Complexity - O(n)
public class Palindrome {
    public static boolean isPalindrome(String str){
        int n = str.length();
        for(int i=0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "racecar";
        String str2 = "apple";
        String str3 = "madam";
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
        System.out.println(isPalindrome(str3));
    }
}
