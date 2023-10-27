import java.util.Scanner;

public class prefixsumsubarray{
    public static void kadanes(){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        
    }
    public static void  main(String [] args){
    int number [] = {2,4,6,8 ,10};
     pairs(number);

}
}



// public static void pairs(int number []){
    //     int currentsum = 0;
    //     int maxsum = Integer.MIN_VALUE;
    //     int prefix [] = new int[number.length];
    //     prefix[0] = number [0];  

    //     for(int i = 1; i<prefix.length; i++){ 
    //         prefix [i] = prefix[i-1]+number[i]; 
    //     }
    //    for(int i =0 ; i <number.length ;i++){     
    //     for(int j = i  ; j<number.length ; j++){ 
    //         currentsum = i == 0 ?  prefix[j] : prefix[j]- prefix[i-1];   
           
    //          if(maxsum<currentsum){
    //             maxsum = currentsum;
    //          } 
    //     }
    //     }
    //    System.out.println("maximum sum of array is  : "+maxsum);
    // }