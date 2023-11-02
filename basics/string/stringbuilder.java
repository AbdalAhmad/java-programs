import java.util.Scanner;

public class stringbuilder{
    
    public static void main (String args []){
    StringBuilder  sb = new StringBuilder("");   // it is StringBuilder SB are capital
    for(char ch= 'a'; ch<='z'; ch++){
        sb.append(ch);
    }
    System.out.println(sb);
    }
}