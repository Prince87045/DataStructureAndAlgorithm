package Arrays;
    //Print pairs of given array
    //Time complexity-O(n²)
public class PrintPair {
    public static void printPair(int arr[]){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            int curr = arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+curr+","+arr[j]+")");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total pairs = "+count);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printPair(arr);
    }
}
