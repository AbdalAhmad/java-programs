import java.util.Scanner;

public class zeroonetriangle{

 public static void number(int row){
    

    for(int i = 1; i<=row ; i++ ){
        for(int j = 1 ;j<=i ; j++){  
          if((i+j)%2 == 0){  // this condition in j 
            System.out.print("1");
          }else{
           System.out.print("0");  // or i can give space
          }

        }
        System.out.println();
    }
 }


    public static void main(String args[]){
      number(5);  // how many rows
    }
}