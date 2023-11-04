import java.util.*;

public class SuperExample {
    public static void main(String args[]) {
        new BlueCar();
    }
}

abstract class Car {
    static {
        System.out.println("1");
    }

    public Car(String name) {
        System.out.println("2");
    }

    {
        System.out.println("3");
    }
}

class BlueCar extends Car {
    {
        System.out.println("4"); 
    }

    public BlueCar() {
        super("blue");// it pass in name
        System.out.print("5");
    }
}
// The "3" is printed before "2" because in Java, instance initializer blocks 
// (the code within { } without a method name) are executed before the constructor
//  when an instance of a class is created.

