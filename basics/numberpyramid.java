import java.util.Scanner;

public class numberpyramid {

  public static void number(int rows) {
  
    for (int i = 1; i <= rows; i++) {
     for(int j = 1 ; j<=(rows-i); j++){
        System.out.print(" ");
     }
      for (int j = 1; j <= i ; j++) {  // j<=n   
         System.out.print(i+" ");
         
      }
        System.out.println(" ");
    }

  }

  public static void main(String args[]) {
    number(6);
  }
}