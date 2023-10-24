import java.util.Scanner;

public class dectobin{
   public static void dectobinary(int decNum){
int pow = 0;
int binNum =0;
int myNum = decNum;
while(decNum>0){
int rem = decNum%2;
binNum = binNum+(rem*(int)Math.pow(10, pow));  // 1//0//1....
pow++;
decNum=decNum/2; // to remove so we deal with other

}
System.out.print("binary  of "+myNum+" is = "+binNum);
   }


    public static void main(String [] args){
dectobinary(7);
    }
}