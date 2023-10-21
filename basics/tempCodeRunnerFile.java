import java.util.Scanner;


public class primenolist { 
    public static boolean prime(int n){ 
       boolean isprime= true;  
       if(n==2){
        return true;
       }
       for(int i = 2; i<=Math.sqrt(n); i++){  
       if(n%i == 0){
        isprime = false;
       }
       }
        return isprime ;
    }
    public static boolean primeRange(int n ){
      for (int i = 2; i<=n;i++){
         if (prime(i) == true);
         { 
           System.out.println(primeRange(i));  // the no will go from there to above function because we have call it and check it 
        }
      } 
      return true;
    }
    
    public static void main (String [] args){
    
 System.out.println(primeRange(10));

        
    }
    
}