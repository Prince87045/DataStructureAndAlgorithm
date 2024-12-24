package Strings;
//For a given String convert the first letter of each word to uppercase
public class Uppercase {
    public static void convertToUppercase(String str){
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ' ' && i<str.length()-1){
                sb.append(" ");
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String str = "hi, i am prince ";
        convertToUppercase(str);
    }
}
