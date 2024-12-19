public class PrefixSum {
    //Time Complexity-O(n²)
    public static void findMaxSum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        //calculate prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        
        for(int i=0;i<arr.length;i++){ //for start
            int start = i;
            for(int j=i;j<arr.length;j++){ //for end
              int end = j;

              currSum = start == 0 ? prefix[end] : prefix[end]-prefix[start-1];
              if(currSum > maxSum){
                maxSum = currSum;
              }
            }
        }
        System.out.println("Max Subarray sum : "+maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        findMaxSum(arr);
    }
}
