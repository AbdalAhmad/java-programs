import java.util.Scanner;

public class subarray{
    public static void parirs(int number []){
        int tp = 0;
       for(int i =0 ; i <number.length ;i++){  // 2      4 6 8 10
        
        for(int j = i  ; j<number.length ; j++){ // 2 24 246 2468 ..   4 46 468 ...  // j is has all value because it store i value and goes to number.length
            for(int k = i ; k<=j ; k++ ){     // it compare with j so it has limit but j is using all value 
                System.out.print(number[k]+ "");  // all sub array come here  
             }
             tp++;
             System.out.println("");
          }
         System.out.println("");
        }
       System.out.println("total subarray are : "+tp);
    }
    public static void  main(String [] args){
    int number [] = {2,4,6,8 ,10};
     parirs(number);

}
}
