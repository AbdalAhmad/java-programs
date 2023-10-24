import java.util.Scanner;

public class integersum {
public static int  check(int number){
 int sum = 0;  // to store sum
//  int num = number;  optional
 while(number > 0){
    sum = sum +number%10;
    number = number/10;
 }
return sum;


}
public static void main (String [] args){
   Scanner abdal = new Scanner(System.in);
 int a = abdal.nextInt();
 System.out.println("The sum is"+ check(a));



}
}
