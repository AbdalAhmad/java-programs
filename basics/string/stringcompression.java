import java.util.Scanner;

public class stringcompression{
    public static String compress(String str){
        String newStr = " ";
        for(int i = 0; i<str.length(); i++){
           Integer count = 1;
           // aaabc
           while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1) ){
            count++;
            i++; // count done here
           }// aa 
           newStr  += str.charAt(i); // abc
           if(count>1){
            newStr += count.toString(); // newstr+count count while print from here  
            // it will add count element in string  
           }
        }
        return newStr;
    }
    public static void main(String args []){
    String str = "aabcd";   //a2bcd
    System.out.println(compress( str));
    }





}