import java.util.*;

public class leapyear{
public static void main (String  args []){
    Scanner abdal = new Scanner(System.in);
    System.out.println("Enter the year : ");
    int year = abdal.nextInt();

    boolean x =((year%4 ) == 0) ; // true 
    boolean  y = (year % 100) != 0;  // not in 100  for a leap year and true then if 400 se bhi   divisible h tb h leap year // if yes then and 4 ka 400
    boolean z = ( (year % 100 == 0) && (year % 400==0));   // true then only 


if(x&&(y||z) ){
System.out.println(year+"is leap year");

} else{
System.out.println(year+"is  not a leap year");

}

}
}