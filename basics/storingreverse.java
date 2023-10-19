import java.util.*;


public class storingreverse{
public static void main (String  args []){
    Scanner abdal = new Scanner(System.in);
    int n = abdal.nextInt();
   int rev = 0;


 while(n>0){
 int lastDigit = n%10;
 rev = (rev*10)+lastDigit; // for storing a reverse 
 n = n/10;
}
System.out.println(rev);
}
}