// display all number entered by a user except multiple of 10

import java.util.Scanner;

public class displaytenonly{
    public static void main(String [] args){
     Scanner abdal = new Scanner(System.in);
     int number = abdal.nextInt();
     
     for(int i = 0; i<=number; i++){
        if(number % 10== 0){
            continue;

        }
        System.out.println("Hello Abdal ");
     }

    }
}