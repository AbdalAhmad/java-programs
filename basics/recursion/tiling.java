import java.util.Scanner;

public class tiling{
    public static int tiling(int n){
        if(n==0||n==1){
            return 1; // for 0 1 n there is only 1 ways
        }
        int fnm1= tiling(n-1);  // vertical ways
        int fnm2 = tiling(n-2);// horizontal ways
        int ways = fnm1+ fnm2;
        return ways;
    } // added
    //  tiling problem this can also come for 4*1
    public static void main(String args[]){
     System.out.println(tiling(4));
    }
}