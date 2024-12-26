package Recursion;
//Find the total no of ways in which friends can remain single or can be paired up
//Time complexity - O(2^n)
public class FriendsPairing {
    public static int friendsPair(int n){
        if(n == 1 || n == 2){ //BaseCase
            return n;
        }
        //single case
        int singleWays = friendsPair(n-1);

        //pair
        int pairWays = (n-1)*friendsPair(n-2);

        return singleWays+pairWays;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(friendsPair(n));        
    }
}
