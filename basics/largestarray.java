import java.util.Scanner;

public class largestarray {
   public static int largest(int number []){
   int largest = Integer.MIN_VALUE;  // largest value having smallest value store - infinity
   int smallest = Integer.MAX_VALUE;

  for(int i = 0; i<number.length ; i++){
    if(largest < number[i]){
        largest = number[i]; // update with new value which is largest value 
    }if(smallest>number[i]){   // it will eat most smallest from an array
        smallest= number[i];   // same here
    }
  }
  System.out.println("Smallest value is "+ smallest);
  return largest;
   }


    public static void main(String [] args){
     int number [] ={78, 65, 44, 76};
      System.out.println("largest value is "+ largest(number));

    }
}