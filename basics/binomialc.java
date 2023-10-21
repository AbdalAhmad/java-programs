import java.util.Scanner;

public class binomialc {
public static int factorial(int n ){
  
    int fact = 1;
  for (int i = 1; i<=n; i++){
   fact *= i;
   
  }
  return fact;
}

public static int binomial(int n , int r){
int a = factorial(n);
int b = factorial(r);
int c = factorial(n-r);

int bino = a/(b*c);
return bino;
}


public static void main(String [] args){
   
   Scanner abdal = new Scanner(System.in);
    int n = abdal.nextInt();
    int r = abdal.nextInt(); 
    System.out.println("Binomial Factorial is "+binomial(n, r));
    System.out.println("Factorial of n is  "+factorial(n)); 
     System.out.println("Factorial of r is  "+factorial(r)); 

    
}
}