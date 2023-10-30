import java.util.Scanner;

public class setith {

  public static int getIthbit(int n, int i) {
    int bitMAsk = 1 << i;  
     return (n|bitMAsk);  
    
  }

  public static void main(String args[]) {
    System.out.println(getIthbit(5, 3));
    System.out.println(getIthbit(5, 2));
  }
}