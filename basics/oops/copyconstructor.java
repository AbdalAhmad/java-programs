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

//  for(int i = 0; i< 3 ; i++){
//         System.out.println(a.marks[i]);
//     }

    Student b = new Student(a);
    b.password = "xyz";
    a.marks[2] = 100; // update  if i use a or b object both give updated value  in shalllow copy 
    for(int i = 0; i< 3 ; i++){ // in deep copy a.marks[2] is not change  in b 
        System.out.println(b.marks[i]);
    }
    }
}
class Student {
   String name;
    int roll;
    String password;
    int marks[];
    //copy// i can use a or any other like c  i used

    // shallow copy    constructor
    // Student(Student c){ 
    //     this.name = c.name;
    //     this.roll = c.roll;
    //     this.marks = c.marks;  // reference copy hogai hai
    // }

    // deep copy constructor
    Student(Student a){
        this.name = a.name;
        this.roll = a.roll;
        marks = new int [3];
        for(int i =0; i<marks.length ; i++){
            this.marks[i] = a.marks[i];  // deep copy ek ek krke copy hogi hain
        }
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