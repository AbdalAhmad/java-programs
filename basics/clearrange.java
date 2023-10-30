import java.util.Scanner;

public class clearrange{
    public static int clearithbit(int n , int i,int j){
   int a = ((~0)<<(j+1)); //left side digit finder j+1 ke badd no change  till there they will keep number digit with no change
   int b = (1<<i)-1; // for right side digit finder to ssame her i-1 after it no change

    return n & (a|b);

    }
    public static void main( String args []){
   System.out.println(clearithbit(10,2, 4));  // 2 digit 

    }
}