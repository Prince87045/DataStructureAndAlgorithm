package Recursion;
//Check if array is sorted in ascending or not
//Time Complexity - O(n)
//Space Complexity - O(n)
public class CheckSortedArray {
    public static boolean isSorted(int arr[],int i){
        if(i == arr.length-1){//Base Case
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,4,6,8,5,9};
        System.out.println(isSorted(arr, 0));
    }
}
