import java.util.Scanner;

public class pairsarray{
    public static void parirs(int number []){
     for(int i = 0; i<number.length; i++){
        int current = number[i]; // 2...  , 4.... 
        for(int j = i; j <number.length ; j++){ // 4, 6, 7 ... , 6,7,....
            System.out.print("("+current +","+number[j]+") ");
        } 
         System.out.println("");
     }
  
    }
    public static void  main(String [] args){
    int number [] = {2,3,4,6,7};
     parirs(number);

}
}