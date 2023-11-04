import java.util.Scanner;

public class rec{
    public static void dec(int n ){
        if(n==1){
            System.out.println(1);
            return;  // yeah case akr execute hokr return krdega
        }
        System.out.print(""+n+" "); // yeah recusrion ke andar  h tu print krwayegi yeah n ko har baar 
        dec(n-1);   // recursion hoga yead tk 
        
    }
    public static void inc(int n ){
        if(n ==1 ){
            System.out.print(1);
            return;
        }
        inc(n-1);        // already executed                                     // for 1 this not 2statement not execute  stack is removed of 1 from call stack,for 2 it is executed already statment but sop not executed it ill done after print of 1 and  stack of 1 removed after printing, same for 2 after seeing stack 2 it will execute the statement which is not executed and  no otehr statement for execution so we return  back, the  stack 2 will removed then move down call  framework  above function is removed , return goes to down one and reach to main function 
        System.out.print(" "+n+" ");         //not excuted after 1 return it will execute             // yeah case recursion ke andar nahi hain tu baad mein check hoga 1 return hone ke badd 
    }
    
    public static void main(String args[]){
      
        int n = 10;
       dec(n); 
        inc(n);
    }
}