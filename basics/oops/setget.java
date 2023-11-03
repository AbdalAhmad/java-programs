import java.util.Scanner;

public class setget{

 public static void  main(String args[]){
   Pen a1 = new Pen();
   a1.setColor("blue"); // here set it value is  passed
   System.out.println(a1.getColor()); // call it from here
  a1.setColor("Yellow"); // here set it value is  passed
   System.out.println(a1.getColor()); //
 }
}

class Pen{
    private String color;

    String getColor(){
        return this.color;
    }  //get color from private

    void setColor(String newColor){
        this.color = newColor;
    } // here set it 
}