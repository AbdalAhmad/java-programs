import java.util.Scanner;
public class constructor{

    public static void main(String args []){
Student a = new Student("abdal");//
System.out.println(a.name); // a.names will not print  you have defined an instance variable named name in the Student class, not names.

    }
}
class Student{
 String name;
   int roll;
//    Student(){
//     System.out.println("constructor is called...");
//    }
// Student(){
//     name = "abdal"; // in double quote
//     System.out.println(name);
// }
Student(String names){
    this.name  = names;  // to store value in name we use
}  // this.name  is used to refer to the name attribute of the Student object being constructed.
//The name attribute is assigned the value of the names parameter that was passed to the constructor.
// the name 
//1
// . The this keyword is used to distinguish between an 
// instance variable and a parameter with the same name.
//2
// By using this.name = names;, you are explicitly assigning the value of the names parameter
//  to the name instance variable. This way, you initialize the object's attributes with the    values passed
//  when creating the object.when creating Student a = new Student("abdal");//
//  System.out.println(a.name); // a.name will get value from name above which abdal is pass in names name will get it 
// we can (a.name) will print it 


}