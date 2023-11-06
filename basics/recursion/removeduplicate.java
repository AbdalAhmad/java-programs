import java.util.Scanner;
public class removeduplicate{
    public static void removed(String str, int index, StringBuilder newStr, boolean map[]){
        if(index == str.length()){
            System.out.println(newStr);
            return ;
        }
        char currChar =str.charAt(index);
        if(map[currChar -'a']== true){
            // a-a=0;
            // duplicate 
            removed(str,index+1, newStr, map);
        }else{
        map[currChar-'a']= true;
        removed(str,index+1, newStr.append(currChar), map);
    }
    }
    public static void main(String args []){
        String str = "appnacolllege";
        removed(str, 0,  new StringBuilder(""),  new boolean[26]);
    }
}