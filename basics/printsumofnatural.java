import java.util.*;


public class printsumofnatural{
public static void main (String  args []){
    Scanner abdal = new Scanner(System.in);
    int n = abdal.nextInt();
  int i =1 ;
  int sum = 0; // to add value we cannot assign sum ; we have to add sum = 0; so that value can be added
  while(i<=n){
    sum +=i;
    i++;
  }
System.out.println("Sum of n number is : "+sum);  
}
}