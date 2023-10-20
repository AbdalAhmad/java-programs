import java.util.*;


public class invertedstar{
public static void main (String  args []){
   int n = 6;

for(int line = 1; line <=n ; line++ ){  // 4 can be take as a user
    for(int star = 1; star<= (n-line+1); star++){
        System.out.print("*");
    }
    System.out.println(""); // for each line space 
}

}

}
