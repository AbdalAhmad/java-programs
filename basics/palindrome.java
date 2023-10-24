import java.util.Scanner;
public class palindrome{
    public static  boolean check(int number){
int rev = 0;
int a = number;
while(a>0){
    rev = rev*10 + a %10;  // last value of condition
    a = a/10;  

}
if(number == rev){ // check with the given number not  with where it is store
    return true;
}else {
    return false;
}

    }
    public static void main(String [] args){
    Scanner abdal = new Scanner(System.in);
    System.out.prinln("Enter the Number");
    int input = abdal.nextInt();

    if(check(input)){
        System.out.println("The Number  "+input+" is  plaindrome Number ");  // it get return  true or 1 so it print if condition
    }
    else{
        System.out.println("The Number  "+input+" is   not a plaindrome Number "); // when false throught return 
    }
    }
}

