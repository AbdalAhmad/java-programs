import java.util.Scanner;

public class invertedhalfpyramid{
    public static void inverted_half(int rows){

        for(int i = 1; i<=rows ; i++){ 
            //spaces 
            for(int j=1; j<=rows-i ;j++ ){
                    System.out.print(" ");
                    }
            // stars        
            for (int j=1; j<=i ; j++){
                System.out.print("*");
            }

            System.out.println(); 
        }
    }

public static void main(String args []){
inverted_half(5);
}

}