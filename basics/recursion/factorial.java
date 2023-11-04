import java.util.Scanner;

public class factorial{
    public static int fact(int n ){
if(n==0){
    return 1;
}
int f = n* fact(n-1);  // now recursion is there n*n-1 is not recursion
return f;
    }
    
    public static void main(String args[]){
      
        int n = 4;
       System.out.print(fact(n));
    }
}