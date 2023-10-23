import java.util.Scanner;

public class primenolist { 
    public static boolean prime(int n){ 
       boolean isprime= true;  
       if(n==2){
        return true;
       }
       for(int i = 2; i<=Math.sqrt(n); i++){  
       if(n%i == 0){
        return false;
       }
       }
        return true ;
    }

    public static void primeinRange(int n ){
      for(int i = 2; i<=n;i++){
         if (prime(i)) { 
           System.out.println(i);  // the no will go from there to above function because we have call it and check it 
        }   
      }  
    }
    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        primeinRange(a);    // one place to print
    }

      
    
}