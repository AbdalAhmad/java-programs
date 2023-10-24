import java.util.Scanner;

public class solidrhombus {

  public static void number(int rows) {
  
    for (int i = 1; i <= rows; i++) {
// space
      for (int j = 1; j <= (rows - i); j++) {
        System.out.print(" ");
      }

   // star
      for (int j = 1; j <= n; j++) {  // j<=n
        System.out.print("*");
      }
         System.out.println("");
    }
 
  }

  public static void main(String args[]) {
    number(5);
  }
}