import java.util.Scanner;

public class pairsarray{
    public static void parirs(int number []){
        int tp =0;
     for(int i = 0; i<number.length; i++){
        int current = number[i]; // 2...  , 4.... 
        for(int j = i; j <number.length ; j++){ // 4, 6, 7 ... , 6,7,....
            System.out.print("("+current +","+number[j]+") ");
            tp++;
               /// if here tp print it will count one by one  
        }   //if here tp print then  tp will count loop wise of i compelete of j only
         System.out.println("");
     }System.out.print("Total pairs are : "+tp+" ");  // here it will count total
  
    }
    public static void  main(String [] args){
    int number [] = {2,3,4,6,7};
     parirs(number);

}
}
