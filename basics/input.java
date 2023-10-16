//how to take input from user in java

import java.util.*;

public class input{
    public static void main (String args[]){
        Scanner abdal = new Scanner(System.in);

        String input = abdal.next();
            System.out.println(input);

        String name = abdal.nextLine();
              System.out.println(name);

         int number = abdal.nextInt();
               System.out.println(number);

           float number = abdal.nextFloat();
                    System.out.println(number);
    }
}

// type of way to take input 
/*
next 
nextInt();
nextFloat();
nextLine();
nextDouble();
nextBoolean();
nextShort();
nextByte();

*/