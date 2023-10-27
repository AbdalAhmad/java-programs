import java.util.Scanner;

public class reversearray {
    public static void reverse(int number []){
    int first = 0; 
    int last = number.length-1;

   while(first<last){
    int temp = number[last];  //temp has stored the last value
    number[last] = number[first];  // last value is  now empty 
    number[first] = temp;
    first++;
    last--;
   }

    }
    public static void  main(String [] args){
    int number [] = {12,23,45,67,77};
   reverse(number);  // call then print no return that way , and also print all no
   //print
for(int i =0 ; i<number.length ; i++){
    System.out.print(number[i]+" "); // all number from i 
  }
    System.out.println("");
    }
}