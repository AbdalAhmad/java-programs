import java.util.Scanner;

public class weekname {

  public static void main(String[] args) {

    Scanner abdal = new Scanner(System.in);
     System.out.println("Enter the number  1 to 7 (Starting  a day from Monday) : ");
    int op= abdal.nextInt();
     

    switch (op) {
      case 1:
        System.out.println("Monday");
        break; // we have to used break keyword
      case 2:
        System.out.println("Tuesday");
        break;
       case 3:
        System.out.println("Wednesday");
        break; // we have to used break keyword
      case 4:
        System.out.println("Thrusday");
        break;
         case 5:
        System.out.println("Friday");
        break; // we have to used break keyword
      case 6:
        System.out.println("Saturday");
        break;
         case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println(" choose no between 1  to 7 ");
    }
  }
}
