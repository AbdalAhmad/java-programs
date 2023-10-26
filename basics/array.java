import java.util.Scanner;
public class array{

public static void main(String args []){
 int marks [] = new int[50];
 int number [] = {1, 2,3,4,};
 Scanner abdal = new Scanner(System.in);
  marks [0] = abdal.nextInt(); // already declare data type

  marks [1] = 100;
  System.out.println(marks[0]);

  System.out.println(marks[1]);
  marks [1] = 101;
  System.out.println(marks[1]);
  
}
}