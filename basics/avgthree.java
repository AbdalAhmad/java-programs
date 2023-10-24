import java.util.Scanner;
public class avgthree{

   public static int avgthree(int a , int b , int c ){
//   int final =   // i have to give value definae them if i want in this way not needed in parameter
       return (a+b+c)/3;
        
   }

    public static void main(String [] args){
     Scanner abdal = new Scanner(System.in);
       
     System.out.println("The average of a values is : "+  avgthree(9,4, 5));
}
}