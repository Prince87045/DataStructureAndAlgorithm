package Recursion;
//Remove duplicates in a String using recursion
//"appnnacollege" -> "apncoleg"
public class RemoveDuplicates {
    public static void removeDuplicate(String str,int idx,StringBuilder newStr,boolean map[]){

        if(idx == str.length()){ //Base Case
            System.out.println(newStr);
            return;
        }
        //kaam
            char currChar = str.charAt(idx);
            //int mapIdx = currChar - 'a';
            if(map[currChar - 'a'] == true){
                //duplicate
                removeDuplicate(str, idx+1,newStr,map);
            } else{ 
                //no duplicate char add in StringBuilder
                map[currChar - 'a'] = true; //update map array to track char 
                newStr.append(currChar);
                removeDuplicate(str, idx+1,newStr,map);
            }
    }
    public static void main(String[] args) {
        String str = "appnncollege";
        StringBuilder newStr = new StringBuilder("");
        boolean map[] = new boolean[26];
        removeDuplicate(str,0,newStr,map);
    }
}
