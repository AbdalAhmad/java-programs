import java.util.Scanner;
public class integernumbersumofeo{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int number;
int evenSum = 0;
int oddSum = 0;

System.out.print("Enter the number ");
number = sc.nextInt();

for(int i  = 0; i<= number ; i++){  // i<=number ; i++ need to check at all number 
    if(i %2 ==0){
        evenSum +=i; // store and add then 
    }else{
        oddSum +=i;

    }
}
System.out.println("Sum of even " + number + " = " + evenSum);
System.out.println("Sum of even " + number + " = " + oddSum);

}
}