import java.util.Scanner;

class multiplicationtable{
   public static void multiplicationtables(int number ){
    Scanner abdal = new Scanner(System.in);
    System.out.println("Enter number : ");
     number  = abdal.nextInt();  // or i can define gere also int number i have define in function
  

   for (int i = 1; i<=10 ; i++){
    System.out.println(number+"*"+i+"="+number*i);
   }
   }

// if system.out.print i outside for loop then we have to print a  int i outside the loop
    public static void main (String a[] ){
       multiplicationtables(10);
    }
}