import java.util.Scanner;
public class duplicate{
public static boolean calculate(int nums []){

    for(int i =0; i<nums.length ;i++){ // 1
        for(int j = i+1; j<nums.length ;j++){ // 3  // 2 // 1 last
            if(nums[i]==nums[j]){  // not true j increase step ahead //  not ture move forward  // last j which is true so priinted other wise it will be false
                return true; 

            }
        }
    }
return false;
}

public  static void main(String args []){
    int nums [] = {1,3,2,1};

System.out.println(calculate( nums));
}
}