// optimized for prime number 
import java.util.Scanner;

public class optimizeprimenumber{

  public static void main(String[] args) {
    Scanner abdal = new Scanner(System.in);
    int number = abdal.nextInt();

    boolean isprime = true; 
    for (int i = 2; i <= Math.sqrt(number); i++) { // square root added it make big number half so the speed become fast as compare to old 
      if (number % i == 0) { 
        isprime = false; 
      }
    if (isprime == true) {
      System.out.println("number  is prime number");
    } else {
      System.out.println("number  is not a  prime number");
    }

  }
}
}