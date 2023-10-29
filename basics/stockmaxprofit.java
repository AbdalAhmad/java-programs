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
    int prices ={12,23,5,3,7};

    }
}