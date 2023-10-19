import java.util.*;


public class reverseofnumber{
public static void main (String  args []){
    Scanner abdal = new Scanner(System.in);
    int n = abdal.nextInt();


while(n>0){
int lastDigit = n%10;

 System.out.print(lastDigit);
    n = n/10;
}

}
}