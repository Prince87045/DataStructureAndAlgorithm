public class MaxSubarraySum {

    //Brute force Approach
    public static void findMaxSum(int arr[]){
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<arr.length;i++){ //start
            for(int j=i;j<arr.length;j++){ //end
                currSum = 0;
                for(int k=i;k<=j;k++){
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if(currSum > max){
                    max = currSum;
                }
            }
        }
        System.out.println("max sum is "+max);;
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        findMaxSum(arr);
    }
}
