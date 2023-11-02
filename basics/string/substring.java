import java.util.Scanner;

public class substring{
    public static String substring(String str, int si , int ei){
        String subst = " ";
        for(int i = si; i<ei ; i++){
            subst += str.charAt(i);

        }
        return subst;
    }
    public static void main(String args[]){
        String str = "Hello World";
        System.out.println(str.substring(0,5)); 
    //    System.out.println(substring(str,0,5));
    }
}