import java.util.Scanner;

public class updatebit {

  public static int getIthbit(int n, int i) {
    int bitMAsk = 1 << i;
    return (n | bitMAsk);
  }

  public static int clearithbit(int n, int i) {
    int bitMAsk = ~(1 << i);
    return n & bitMAsk;  // last bit 
  }
  public  static int updatebit(int n ,int i , int updatevalue){
//     if(updatevalue == 0){
//         return clearithbit(n, i); // for 0 it come from clear bit
//     }else{
//         return setith(n,i);  // for 1 it come from set bit if you want to update this part to use
//     }
//   }
n = clearithbit(10,2); // 2 digit last clear it 
return n| (updatevalue<<i); // or i can put direct 0
 
//   s = getIthbit(10,3);  // 3 pr 1 set krdo  1 done|new update value by choice 0 or 1 but here should we 1
//  return s|(updatevalue<<i); // or i can put direct 1
  }


  public static void main(String args[]) {
    System.out.println(updatebit(10,  2, 1)); // 2 digit
  }
}
