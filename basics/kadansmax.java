import java.util.Scanner;

public class prefixsumsubarray{
    public static void kadanes(){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
     for(int i =0; i<number.length ;i++){
        cs = cs+number[i];
        if(cs<0){
            cs =0;
        }
        ms = Math.max(cs,ms); // jo bhi max hoga cs or max mein se  vo ms mein chale jayega
     }
    }
    public static void  main(String [] args){
    int number [] = {2,4,6,8 ,10};
     pairs(number);

}
}




  