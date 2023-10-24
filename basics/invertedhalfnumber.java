import java.util.Scanner;

public class invertedhalfnumber{
    public static void inverted_half(int rows){

        for(int i = 1; i<=rows ; i++){  

         for(int j=1; j<=rows-i+1 ;j++ ){  // number 
                    System.out.print(j);  
                    }    
            for (int j=1; j<=i ; j++){  // space
                System.out.print(" ");  
            }
   
           
            System.out.println(); 
        }
    }

public static void main(String args []){
inverted_half(5);
}

}