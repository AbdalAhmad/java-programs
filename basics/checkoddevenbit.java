import java.util.Scanner;

public class checkoddevenbit {

  public static void oddEven(int n) {
    int bitMAsk = 1;
    if ((n & bitMAsk) == 0) {
      System.out.println("even number");
    } else {
      System.out.println("odd number");
    }
  }

  public static void main(String args[]) {
    oddEven(3);
    oddEven(5);
    oddEven(8);
  }
}
