import java.util.*;
// these are logical  operator

public class Logicaloperator{
    public static void main (String args []){
    
    // and operator
     System.out.println((6>4)&&(7>0));  // both are true 
      System.out.println((3>4)&&(7>0));
       System.out.println((6>4)&&(2>5));
        System.out.println((2>4)&&(1>7));
         System.out.println("   ");  // both are true 
     
    // or operator
    System.out.println((6>4)||(7>0));  // both are true 
      System.out.println((3>4)||(7>0));
       System.out.println((6>4)||(2>5));
        System.out.println((2>4)||(1>7));
         System.out.println("   ");
         
         // logical not
          System.out.println(!(6>4));  // true but become flase
            System.out.println(!(2>4));
    }
    
    }