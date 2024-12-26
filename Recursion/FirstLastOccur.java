package Recursion;
//Find the first and last occurence of an element in an array
//Time Complexity - O(n)
public class FirstLastOccur {
    public static int firstOccur(int arr[],int key,int i){
        if(i == arr.length){//Base Case - Reached the end of array
            return -1;
        }
        if(key == arr[i]){ 
            return i;  //Return index if key is found
        }
        return firstOccur(arr, key, i+1);   //Recursively call the function
    }
    
    public static int lastOccur(int arr[],int key,int i){
        if(i == -1){//Base Case - Reached the start of array
            return -1;
        }
        if(key == arr[i]){ 
            return i;  //Return index if key is found
        }
        return lastOccur(arr, key, i-1);   //Recursively call the function
    }

    public static void main(String[] args) {
        int arr[] = {8,3,6,1,9,5,10,2,5,3,1};
        System.out.println(firstOccur(arr,1,0));
        System.out.println(lastOccur(arr,8,arr.length-1));
    }
}
