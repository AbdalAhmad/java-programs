import java.util.*;
// for area of circle pi*r*r
public class areaofcircle{
    public static void main (String args []){
 Scanner abdal = new Scanner(System.in);
 
  float radius = abdal.nextFloat();
 
 float areaofcircle = 3.14f * radius * radius; // now it is float value //it confuse in vlaue whether it is float or double so we use f after the vlaue
   System.out.println(areaofcircle);
  

    }
}