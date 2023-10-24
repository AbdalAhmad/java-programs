import java.util.Scanner;

public class floydstriangle{

 public static void number(int row){
    int  count = 1;

    for(int i = 1; i<=row ; i++ ){
        for(int j = 1 ;j<=i ; j++){
          System.out.print(count+" ");
          count++;
        }
        System.out.println();
    }
 }


    public static void main(String args[]){
      number(5);  // how many rows
    }
}