// we hvae to store value so  have to decalare factorial with 1 not like table store also not only multiply



import java.util.*;

public class calfactorial {

//   public static int multiply(int a, int b) {
//     int c = a * b;
//     return c;
//   }
  public static int factorial(int n ){
    int f= 1;
    for(int i = 1;i<=n; i++){
        f = f*i;   // till loop but with upgrade in f new value 
    }
    return f;
  }

  public static void main(String[] args) {
    Scanner abdal = new Scanner(System.in);
    // int num1 = abdal.nextInt();
    // int num2 = abdal.nextInt();

    // int product = multiply(num1, num2);
    // System.out.println("product of a and b : " + product);

    // int product2 = multiply(2, 3);
    // System.out.println("product of a and b : " + product2); //for this i have to input from user or declare outside

    // int num3 = 2;
    // int num4 = 5;
    // int product3 = multiply(num3, num4);
    // System.out.println("product of a and b : " + product3);

    int n = abdal.nextInt();  //or give value or not give any value direct in actual prameter value wil print
    System.out.println(factorial(n));
  }
}