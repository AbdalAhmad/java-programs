import java.util.Scanner;

public class countbit{
    public static int  check(int n ){
        int count =0 ;
        while(n>0){
            if((n&1) != 0){
                count++;
            }
            n= n>>1;
        }
        return count;
    }
    public  static void main(String args[]){

         System.out.println (check(3));
    }
}