import java.util.Scanner;

public class linearsearch{              // [] this have to print in array here also
    public static int position(int numbers [] , int key){  // return in int upar bhi int
   
   for (int i = 0; i<numbers.length ; i++){
    if(numbers[i]== key){
        return i;
    }
   }
    return 0;

    }
    public static void main(String [] args){
    int numbers [] = {89, 99, 100, 20, 44 };
     int key = 100;

    int index = position(numbers, key);  // number key are given because to seee at what postion they are equal

     if(index == 0){  // index if for to store value in this function
       System.out.println("not found");
     }else{
         System.out.println(" found  at "+index);
     }
    }
}