// return max profit you can achieve from this transaction
// return 0 if no profit can be achieved
// Time Complexity-O(n)
public class SellStocks {
    public static int maxProfit(int prices[]){
        int maxProfit = 0, buyPrice = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            if(prices[i] > buyPrice){ //profit
                int profit = prices[i] - buyPrice; //today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        //price of a given stock on the ith day
        int prices[] = {7,1,5,3,6,4};
        System.out.println("Maximum Profit is : " + maxProfit(prices));
    }
}
