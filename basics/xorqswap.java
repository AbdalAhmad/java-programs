import java.util.Scanner;

public class xorqswap {

  public static void main(String args[]) {
    int x = 3;
    int y = 4;

    x = x^x; // x  =0
    y =x^y;  // y = 1
    x = x^y; // x = 1  swap the value
    System.out.println(x+" "+y);
  }
}
