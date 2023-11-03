import java.util.Scanner;

public class copyconstructor{
    public static void main(String args[]){
    Student a = new Student();
    a.name = "Abdal";
    a.roll = 456;
    a.password = "abcd";
    a.marks[0] = 100;
    a.marks[1] = 80;
    a.marks[2] = 90;

 for(int i = 0; i< 3 ; i++){
        System.out.println(a.marks[i]);
    }
    Student b = new Student(a);
    b.password = "xyz";
    b.marks[2] = 100; // update  if i use a or b object both give updated value 
    for(int i = 0; i< 3 ; i++){
        System.out.println(b.marks[i]);
    }
    }
}
class Student {
   String name;
    int roll;
    String password;
    int marks[];
    //copy
    Student(Student c){ // i can use a or any other like c  i used
      
        this.name = c.name;
        this.roll = c.roll;
        this.marks = c.marks;

    }
    Student(){
        marks = new int [3];
        System.out.println("constructor is called...");
    }
    Student(String name){ // we can use in every function array marks because every constructor should know only 3 subject is there
        this.name = name;
    }
    Student(int roll){ 
        this.roll = roll;
    }
    
}