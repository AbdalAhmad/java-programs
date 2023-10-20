import java.util.*;

public class funcwithpram{

 public static void functions(){
    System.out.println("Hello World");
 }

public static  int CalculateSum(int num , int num2){

int total = num+num2;
return total; // in function only define functionality not other thing keywiord or user input only parameter and functionality and return it 
}
    
public  static void main(String [] args){
 Scanner abdal = new Scanner(System.in);
int a = abdal.nextInt();  // it get value
int b = abdal.nextInt();
int sum = CalculateSum(a ,b ); // it print value from function
System.out.println("Sum is :" + sum);

    }
}