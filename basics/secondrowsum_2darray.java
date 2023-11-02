import java.util.Scanner;

public class  secondrowsum_2darray{
    public static void main (String args[]){
        int[][] array = { {4, 7, 8}, {8, 8, 7} };
        int sum= 0;
     
            for(int j =0; j<array[0].length ; j++ ){
                sum += array[1][j];
            }
        
        System.out.println("sum of 2nd row  is = "+sum);
    }


}