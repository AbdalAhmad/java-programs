import java.util.Scanner;

public class findfactorial {
public static void main(String[] args) {
Scanner abdal = new Scanner(System.in);
System.out.println("Enter the number : ");
int number = abdal.nextInt();

int fact = 1;
for(int i = 1 ; i<=number ; i++){
    fact *=i;

}

System.out.println("Factorial "+fact);
}
}