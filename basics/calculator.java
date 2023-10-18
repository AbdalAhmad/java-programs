import java.util.Scanner;

public class calculator {

  public static void main(String[] args) {
    Scanner abdal = new Scanner(System.in);
    char op;
    double result;

    System.out.println("Enter the number 1 : ");
    int a = abdal.nextInt();

    System.out.println("Enter the number 2 : ");
    int b = abdal.nextInt();

    System.out.println("Enter the operator : ");
    System.out.println("choose any in this +,-,*,/,%");

    op = abdal.next().charAt(0); // for a single  statement //next().charAt()

    switch (op) {
      case '+':
        result = a + b;
        System.out.println(result);
        break; // we have to used break keyword
      case '-':
        result = a - b; // it should assign correctly a-b = result is not correct way
        System.out.println(result);

        break;
      case '*':
        result = a * b;
        System.out.println(result);
        break;
      case '/':
        result = a / b;
        System.out.println(result);
        break;
      case '%':
        result = a % b;
        System.out.println(result);
        break;
      default:
        System.out.println("choose again in 1 or 2 or 3");
    }
  }
}
