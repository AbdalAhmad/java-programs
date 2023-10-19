import java.util.Scanner;

public class breaka{
    public static void main(String[] args) {
        Scanner abdal = new Scanner(System.in);
        int counter = abdal.nextInt();

        int i = 1;
        do {
            System.out.println("Hello Abdal");
            if (i == 3) {
                break;
            }
            i++; // Increment i in each iteration.
        } while (i <= counter);
    }
}