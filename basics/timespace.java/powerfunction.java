import java.util.Scanner;

public class powerfunction{
    public static int power3(int a, int n ){
        if(n==0){
            return 1;

        } 
        int halfpower = power3(a, n/2);
        int halfpowersq = halfpower* halfpower;
        if(n%2==0){
            return a*halfpowersq;
        }
        return a*halfpowersq;
    }
    public static void main(String args []){
    
     System.out.println( power3(2,5));
    }
}