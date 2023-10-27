import java.util.Scanner;

public class prefixsumsubarray{
    public static void pairs(int number []){
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix [] = new int[number.length];
        prefix[0] = number [0];  // 0 wale ka sum hai prefix ke pass 

        for(int i = 1; i<prefix.length; i++){ // so i also started by 1 thats way
            prefix [i] = prefix[i-1]+number[i];  //old sum + new sum 0 value already store goes to prefix[i] i which is also equal to j
        }
       for(int i =0 ; i <number.length ;i++){     // this is for middle one        
        for(int j = i  ; j<number.length ; j++){  // to remove k loop we have made better way
            currentsum = i == 0 ?  prefix[j] : prefix[j]- prefix[i-1];   // start is 0 to vo hi end ho jayega
             // prefix j mean i= 0 wali j=i tu j= 0 wali value last value hain other wise solve it
             if(maxsum<currentsum){
                maxsum = currentsum;
             } 
// we know start and end  value by i start and j for  end 
        }
        }
       System.out.println("maximum sum of array is  : "+maxsum);
    }
    public static void  main(String [] args){
    int number [] = {2,4,6,8 ,10};
     pairs(number);

}
}
