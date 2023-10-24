import java.util.Scanner;

public class diamond {

  public static void number(int rows) {
  
    for (int i = 1; i <= rows; i++) {
     for(int j = 1 ; j<=(rows-i); j++){
        System.out.print(" ");
     }
      for (int j = 1; j <= (2*i)-1 ; j++) {  // j<=n   
         System.out.print("*");
         
      }
        System.out.println(" ");
    }
    // 2nd half 
     for (int i = rows; i >= 1; i--) {
     for(int j = 1 ; j<=(rows-i); j++){
        System.out.print(" ");
     }
      for (int j = 1; j <= (2*i)-1 ; j++) {  // j<=n   
         System.out.print("*");
         
      }
        System.out.println(" ");
    }
 
  }

  public static void main(String args[]) {
    number(8);
  }
}