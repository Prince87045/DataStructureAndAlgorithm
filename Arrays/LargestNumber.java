package Arrays;

public class LargestNumber {
    //find the largest element in the given array
    public static int findLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
       return largest;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,6,13,5};
        int result = findLargest(arr);
        System.out.println(result);
    }
}
