import java.util.Scanner;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
array, and return false if every element is distinct.
public class duplicate{
public static boolean calculate(int nums []){
// -Brute Force  time compelexity - (O(n^2))
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

//   approach 2 - using Sets (O(n))
/*You should have a basic knowledge about Java HashSets before following Approach 2.It willbe
taughtto you in later chapters. */
// public boolean containsDuplicate(int[] nums) {
// HashSet<Integer> set = new HashSet<>();
// for(int i=0; i<nums.length; i++) {
// if(set.contains(nums[i])) {
// return true;
// } else {
// set.add(nums[i]);
// }
// }
// return false;
// }