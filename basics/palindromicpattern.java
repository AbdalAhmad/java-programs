import java.util.Scanner;

public class palindromicpattern {

  public static void number(int rows) {
  
    for (int i = 1; i <= rows; i++) {
     for(int j = 1 ; j<=(rows-i); j++){
        System.out.print(" ");
     }
      for (int j = i; j >=1 ; j--) {  // descending  
         System.out.print(j);
         
      }
      for (int j = 2; j <= i ; j++) {  // ascending
         System.out.print(j);  // no is increasing not same we have to print so we have to use j
         
      }
        System.out.println(" ");
    }

  }

  public static void main(String args[]) {
    number(6);
  }
}