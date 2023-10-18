import java.util.Scanner;

public class postiveornegative {

  public static void main(String args[]) {
    Scanner abdal = new Scanner(System.in);
    int a = abdal.nextInt();

    if (a > 0) {
      System.out.println("The value is positive: ");
    } else {
      System.out.println("The value is negative: "); // use full " "
    }
  }
}
