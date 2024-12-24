package Strings;

public class StringCompress {
    public static void compressString(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            int count = 1;
            char ch = str.charAt(i);
            while(i<str.length()-1 && ch == str.charAt(i+1)){
                count++;
                i++;
            }
            if(count > 1){
                sb.append(ch);
                sb.append(count);               
            } else {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String str = "aaabbccccd";
        compressString(str);
    }
}
