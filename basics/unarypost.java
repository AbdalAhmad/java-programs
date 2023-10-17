import java.util.*;
// these are unary operator

public class unarypost{
    public static void main (String args []){
    int a = 10;
    System.out.println("a old  value: "+a);
    int b =a--; // it will get old value of a which will print , then new value b  it will get and  those value c will take it for print
    int c =a--;  // in c ,c will print then change ,change value goes to a  
  System.out.println("a new  value(main ): "+a);
    System.out.println("b value: "+b);
     System.out.println("c value: "+c);
     System.out.println("a  it goes  up  from down only to up (return like )value: "+a);
  // if i use a++ post increment in c then a value willprint then increase like b = 10 (get old vlaue)  is having then c will have value 9  because b is decrease operator and a also will print new 
  // value which will be 10  
  
    }
    
    }