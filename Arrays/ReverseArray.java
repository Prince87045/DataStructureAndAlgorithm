package Arrays;
//Reverse the given array
//Space complexity-O(1) , Time Complexity-O(n)
public class ReverseArray {
    public static void reverseArray(int arr[]){
        int first = 0;
        int last = arr.length-1;
        while(first < last){
            //swapping (first and last) without using temp variable
            arr[first] = arr[first]+arr[last];
            arr[last] = arr[first] - arr[last];
            arr[first] = arr[first] - arr[last];
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};

        //Printing the Original Array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        reverseArray(arr);

        //Printing the Reversed Array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
