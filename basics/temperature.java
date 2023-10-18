import java.util.Scanner;

public class temperature {

  public static void main(String args[]) {
    Scanner abdal = new Scanner(System.in);
   double temperature = abdal.nextInt();

    if (temperature > 99) {
      System.out.println("pateint have a fever ");
    } else {
      System.out.println("pateing don't have a fever "); // use full " "
    }
  }
}
