import java.util.Scanner;

public class prime { 
    public static boolean prime(int n){  // boolean have to give for return type

       boolean isprime= true;  

       if(n==2){
        return true;
       }
       for(int i = 2; i<=Math.sqrt(n); i++){  // not used n-1 or n/2 we use this to optimize code
       if(n%i == 0){
        isprime = false;
        // return false
         // not prime
       }
       }
        return isprime;
    }
    
    public static void main (String [] args){
    Scanner abdal = new Scanner(System.in);
    int a = abdal.nextInt();
           System.out.println(prime(a));
            
    }
    }
    