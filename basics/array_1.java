import java.util.*;
public class array_1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int array[] = new int[3];
        for(int i=0;i<3;i++){
            System.out.print("Enter the value of element ");
            array[i] = sc.nextInt();
        }
        for(int i=0;i<3;i++){
            System.out.println(array[i]);
        }
        
    }
}