package Recursion;
//Find all occurences(index) of a given element(key) and print them
public class FindOccurences {
    public static void findAllOccurences(int arr[],int key,int idx,StringBuilder sb){
        if(idx == arr.length){ //Base Case - reached the end of array
            if(sb.length() == 0){
                System.out.println(sb.append("-1"));
            }else{
                System.out.println(sb);
            }
            return;
        }
        if(key == arr[idx]){ //if key found
            sb.append(idx+" ");
        }
        findAllOccurences(arr,key,idx+1,sb);//recursively call the function for the rest of the array
    }
    public static void main(String[] args) {
        int arr[] = {3,1,5,7,9,10,6,8,5,3,3};
        int key = 3;
        findAllOccurences(arr,key,0,new StringBuilder(""));
    }
}
