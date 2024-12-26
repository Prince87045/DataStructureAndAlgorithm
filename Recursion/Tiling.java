package Recursion;
//calculate no of ways to fill tile '2*1' on board size '2*n'
public class Tiling {
    public static int tilingProblem(int n){//2*n (floor size)
        if(n == 0 || n == 1){ //base case - if board size is 2*0 and 2*1
            return 1;
        }
        //kaam
        //vertical choice
        int fnm1 = tilingProblem(n-1);

        //horizontal choice
        int fnm2 = tilingProblem(n-2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(tilingProblem(n));
    }
}