import java.util.*;


public class characterpattern{
public static void main (String  args []){
   int n = 7;
   char ch = 'A';

for(int line = 1; line <=n ; line++ ){  // 4 can be take as a user // line
    for(int j = 1; j<= line; j++){  // star
        System.out.print(ch);
        ch++;
    }
    System.out.println(""); // for each  line space 
}

}

}