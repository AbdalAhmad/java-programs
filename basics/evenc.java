import java.util.Scanner;
public class evenc{
   public static boolean evenodd(int n ){
    if(n%2== 0){
       return true;  // if condition is true 
        
    }else{
        return false;
    }   
   }
    public static void main(String [] args){
     Scanner abdal = new Scanner(System.in);
       int a = abdal.nextInt();
      if(evenodd(a)){
        System.out.println("Number is even");
      }else{
        System.out.println("Number is odd");
      }

}
}


