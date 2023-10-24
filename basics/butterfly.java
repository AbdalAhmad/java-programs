import java.util.Scanner;

public class butterfly {

  public static void number(int rows) {
    // stars
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      // space
      for (int j = 1; j <= 2 * (rows - i); j++) {
        System.out.print(" ");
      }

      // stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
         System.out.println("");
    }
 
    // 2nd Half             i = 5,4,3,2,1
    for (int i = rows; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      // space
      for (int j = 1; j <= 2 * (rows - i); j++) {
        System.out.print(" ");
      }

      // stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
       System.out.println("");
    }
  }

  public static void main(String args[]) {
    number(5);
  }
}
