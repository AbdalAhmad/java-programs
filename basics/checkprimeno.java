import java.util.Scanner;

public class checkprimeno {

  public static void main(String[] args) {
    Scanner abdal = new Scanner(System.in);
    int number = abdal.nextInt();

    boolean isprime = true; //define true and false
    for (int i = 2; i <= number - 1; i++) {
      if (number % i == 0) { //when false when this happen // it will give some remainder
        isprime = false; // false it is not prime
        //  System.out.println("is not  a prime a number"); this is wrong
      }
    } // this is not written in a loop otherwise print for each number where it check

    if (isprime == true) {
      System.out.println("number  is prime number");
    } else {
      System.out.println("number  is not a  prime number");
    }
    // else{
    //     System.out.println("is  a prime a number");
    //    } this will not work it will check divisiblilty from a number

  }
}
/// prime number are self and in 1 table are not multiple of other number  have to only 2 co-factor
// 235711
