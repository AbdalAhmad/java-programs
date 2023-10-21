import java.util.*;

public class productofaandb{

    public static int multiply(int a , int b){
    int c = a*b;
    return c;
    }

    public static void main(String [ ]  args){
 Scanner abdal = new Scanner(System.in);
  int num1= abdal.nextInt();
  int num2 = abdal.nextInt();

   int product = multiply(num1, num2);
   System.out.println("product of a and b : "+product);

}
}