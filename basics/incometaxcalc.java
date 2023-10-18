import java.util.Scanner;

public class incometaxcalc{
public static void main(String[] args){
    Scanner abdal = new Scanner(System.in);

    int income =  abdal.nextInt();
    int tax ;
if(income<500000){
    tax = 0;
}
  
else if(income>500000 &&income<1000000){ // if is used-  then it check above statment true  ,then if second one become false in less than 5lakh it print else statement
tax = (int)(income*0.2); // so we have used else if because it check if statement is true  then it not move else if (if again not written) it print from there only
}
else{
    tax = (int)(income*0.3);
}  // else will skip and else if , if used if statement then it will check above if which is true then it move to second one which is false then it move to else
 System.out.println("your tax is : " + tax);
}  
}  // we use else if skip else groups if there is true value in if 