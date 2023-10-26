import java.util.Scanner;

public class argumentarray {

  public static void update(int marks[] , int nochange ) {
    nochange = 5;
    for (int i = 0; i < marks.length; i++) {
      marks[i] = marks[i] + 1;
    }
  }
//  array pass by reference
  public static void main(String[] args) {
    int nochange = 10; //  call by value no change
    int marks[] = { 98, 99, 100 };  // sb mein one add hogya hain
    
    update(marks, nochange);
    System.out.println("there  is no change because argument only pass in array : "+nochange);
    // checking again marks // marks.length jaha tk length hu marks ki
    for (int i = 0; i < marks.length; i++) {
      System.out.println(marks[i] + " ");
    }
    System.out.println();
  }
}
