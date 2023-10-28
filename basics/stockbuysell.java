import java.util.Scanner;

public class stockbuysell{
public static int stock(int prices []){
    int buyPrice = Integer.MAX_VALUE;
    int maxProfit =0;

    for(int i = 0 ; i<prices.length ;i++){
        if(buyPrice<prices[i]){    // there is profit chance
            int profit = prices[i] - buyPrice;  // sell at profit  through each day check 
            maxProfit = Math.max(maxProfit,profit);  // store max profit   from each day profit but only  maximum
        }else{
            buyPrice = prices[i]; // low then we should buy stock 
        }
    }
    return maxProfit;
}


public static void main (String args []){
int prices [] = {7,1,5,3,6,4};
System.out.println(stock(prices));
}  // it  is old result that  should sell on that day old result value tell on that will be you can have it max profit
}
