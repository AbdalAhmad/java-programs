import java.util.Scanner;

public class clearlastith{
    public static int clearithbit(int n , int i){
    int bitMAsk = ~(1<<i);
    return n & bitMAsk;
    }
    public static void main( String args []){
   System.out.println(clearithbit(100,2));  // 2 digit 

    }
}