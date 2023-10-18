import java.util.Scanner;

public class printthelargest{
public static void main(String[] args){
    Scanner abdal = new Scanner(System.in);
// print the largest number 
    int a =  abdal.nextInt();
   int b =  abdal.nextInt();
   int c =  abdal.nextInt();

   if((a>=b)&&(a>=c)){  // for with equal we used like this
   System.out.println("A is the largest ");
   }
   else if(b>=c) {
   System.out.println("B is the largest");

   }
   else{
     System.out.println("C is the largest");
   }
   
}  
}  







 // else if when if is false then , if when if is true then again check