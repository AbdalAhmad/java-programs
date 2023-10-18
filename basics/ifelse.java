import java.util.Scanner;

public class ifelse{
public static void main(String[] args){
    Scanner abdal = new Scanner(System.in);
    int age =  abdal.nextInt();
if(age>=18){
System.out.println("you are eligible for marriage");
}
if (age>13 || age<18){  // in this operator equal sign is not used
System.out.println("you are eligible but have to wait in marriage ");
}
else{
System.out.println("you are not eligible for marriage");

}
}
}