import java.util.Scanner;

public class overloadingdatat {
    public static int sum(int a ,int b){
       
        return a*b;
    }
     public static float sum(float a ,float b ){  // for return type i have to type flaot there 
       
        return a*b; // fucntionality also
    }
    public static void main (String [] args){
       
           System.out.println(sum(3,6));
             System.out.println(sum(3.5f,6.5f)); // f because java confuse in float or double

    }
}
