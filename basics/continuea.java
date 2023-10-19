import java.util.Scanner;

public class continuea{
    public static void main(String[] args) {
        Scanner abdal = new Scanner(System.in);
        int counter = abdal.nextInt();

      for(int i = 0; i< counter ; i++){

        if(i == 4){
     continue;
        }else{
        System.out.print("Hello Lucky ");
        }
      }
   
}
}