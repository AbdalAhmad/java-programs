import java.util.Scanner;

public class stockmaxprofit{
  public  static int profitmax(int prices []){
    int buy = prices[0];
    int profit = 0;

    for(int i = 0; i<prices.length ;i++){
        if(buy<prices[i]){
            profit = Math.max(prices[i]-buy, profit);
        }else{
            buy = prices[i];
        }
    }
   return profit;
  }

    public static void main(String args[] ){
    int prices [] ={12,23,5,3,7};
    
     System.out.println(profitmax(prices));
    }
   
}

//You are given an array prices where prices[i] is the price of a given stock on
// the i
// th day.
// Return the maximum profit you can achieve from this transaction. If you cannot
// achieve any profit, return 0.