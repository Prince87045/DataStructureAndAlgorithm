package Arrays;
//Binary Search prerequisite-sorted array
//find element in the given array. Time Complexity-O(log n)
public class BinarySearch {
    public static int binarySearch(int arr[],int key){
        int start = 0 , end = arr.length-1;
            while(start <= end){
                int mid = (start+end) / 2;

                //comparison
                if(arr[mid] == key){ //key found
                    return mid;
                } else if(arr[mid] > key){ //search left
                    end = mid-1;
                } else{ //search right
                    start = mid+1;
                }
            }
            return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14};
        int key = 6;
        int index  = binarySearch(arr,key); //return -1 if element/key not found
        System.out.println(index);
    }
}
