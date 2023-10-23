import java.util.Scanner;

public class bintodec{
public static void binarydec(int binaNum){  // to get binary number 
int pow =0;  // for power
int decNum= 0;  // to  decimal values we will get 
int myNum =binaNum; // not coorect way for output we have to save it 

while(binaNum> 0){
    int lastDigit = binaNum%10;  // not to used here myNum give wrong answer
    decNum = decNum + (lastDigit*(int)Math.pow(2,pow));
    pow++; 
     binaNum = binaNum/10; // to store 
}
System.out.println("decimal of "+myNum+'='+decNum);  // myNum is for here to store value and we can print otherwise it is printing old value and new value not printed myNum is not used in other place same think error will it show 
} // so we have to print nyNum calling after all condition have passed or done 

public static void main(String [] args){
    binarydec(101);
    }
}