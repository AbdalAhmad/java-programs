import java.util.Scanner;

public class binarysearch {
public static int binarys(int number [] , int key){
int start = 0 ,  end = number.length -1 ;

 while(start<= end){  // start also end also then case will be equal 
  int mid = (start +  end)/2;
   // compare 
   if(number[mid] == key){  //mid position value if equal to key then it will telll the that postion
       return mid; 
   }   // key khah pr hain
   if(number[mid]< key){  // binary search is best way then linear search it is line search then binary search
    start = mid + 1;
                     // it is fastest way then linear search
   }else{ // mid>key
    end = mid - 1;    //  this is for shift take to the eqaul to key and find position at which place number is 
   }
 }   // they only all go mid == key all condition will go then only loop will will end  or return - 1
 return -1;   
}

    public static void main(String [] args){
int number [] = {12, 14, 16, 46, 64 };
int key = 16;  // key h hai
System.out.println("key is at  "+binarys(number , key )); // value are going first then coming in return value
    }
}