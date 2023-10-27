import java.util.Scanner;

public class maxsubarraysum{
    public static void pairs(int number []){
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        
       for(int i =0 ; i <number.length ;i++){  // 2      4 6 8 10
        
        for(int j = i  ; j<number.length ; j++){ // 2 24 246 2468 ..   4 46 468 ...  // j is has all value because it store i value and goes to number.length
            currentsum =0;  // to be 0 when new start , max value will go from it in currentsum
            for(int k = i ; k<=j ; k++ ){     // it compare with j so it has limit but j is using all value 
                currentsum +=number[k];
                // System.out.print(number[k]);

             }
             System.out.println(currentsum);  // this is the sum of  each sub array  of array
             if(maxsum<currentsum){
                maxsum = currentsum;
             }  // we used this instead of  total pair or total sub array  of all we now find max sum of sub array is
            
            //  System.out.println("");
          }
         System.out.println("");
        }
       System.out.println("maximum sum of array is  : "+maxsum);
    }
    public static void  main(String [] args){
    int number [] = {2,4,6,8 ,10};
     pairs(number);

}
}
