import java.util.Scanner;

public class exponentiation {

  public static int fastExpo(int a, int n) {
    int intial = 1;
    while (n > 0) {
      if ((n & 1) != 0) {
        intial = intial * a;
      }
      a = a * a;
      n = n >> 1;
    }
    return intial;
  }

  public static void main(String args[]) {
    System.out.println(fastExpo(5, 3));
  }
}
