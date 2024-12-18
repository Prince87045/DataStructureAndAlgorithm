package Arrays;
//Print subarray of given array
//Time complexity-O(n³)
public class PrintSubarray {
    public static void printSubarray(int arr[]){
        int count = 0;
        for(int i=0;i<arr.length;i++){//for start
            for(int j=i;j<arr.length;j++){//for end
                for(int k=i;k<=j;k++){//print subarrayarray between start and end
                    System.out.print(arr[k]+" ");
                }
                count++;
                System.out.println();
            }
        }
        System.out.println("Total pairs = "+count);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printSubarray(arr);
    }
}
