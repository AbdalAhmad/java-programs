import java.util.Scanner;

public class stoptendivi{
    public static void main(String[] args) {
        Scanner abdal = new Scanner(System.in);
        int counter = abdal.nextInt();

      for(int i = 0; i< counter ; i++){

        if(counter%10 == 0){
      break;
        }else{
        System.out.print("Hello Lucky ");
        }
      }
   
}
}