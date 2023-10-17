import java.util.*;

public class Quesc{
    public static void main (String args []){
     Scanner abdal = new Scanner(System.in);

   System.out.println("Enter the cost of pencil  , pen  and eraser : " );
     float pencil = abdal.nextFloat();
     float pen = abdal.nextFloat();
     float eraser= abdal.nextFloat();

     float Toatl = (pencil+pen+eraser);

     System.out.println("Adding gst  also which is 18% " );
     float gst = 0.18f;  // it is 18/100 = 0.18*total;

   System.out.println("The Total Cost  of items is : " );
     float ToatlCost = Toatl+ (gst*Toatl);
       
     System.out.println(ToatlCost);

    }
    
    }