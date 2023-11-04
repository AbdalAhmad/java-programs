import java.util.Scanner;

public class sumn{
    public static int sum(int n ){
if(n==1){
    return 1;
}
int s = sum(n-1); // yeah call yeah tk lg rahi hain that why it is not needed but then also for explain i written 
int f = n + sum(n-1);   // stack 2 will come here for return and to then stack 2 will remove, then stack 3 will return  to  and print and same as 2 stack also removed
return f; // stack 2 return a value  to stack 3  and stack  2  will remove  and after 3 will execute and same thing happen it will return to below stack its value and remove ourself from stack 
    }
    
    public static void main(String args[]){
      
        int n = 5;
       System.out.print(sum(n));
    }
}