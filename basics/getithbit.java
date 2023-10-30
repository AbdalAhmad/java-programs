import java.util.Scanner;

public class getithbit {

  public static int getIthbit(int n, int i) {
    int bitMAsk = 1 << i;  // 1 binary will shift to check
    if ((n & bitMAsk) == 0) { //0 
      return 0;  
    } else {
      return 1;
    }
  }

  public static void main(String args[]) {
    System.out.println(getIthbit(5, 3));
    System.out.println(getIthbit(5, 2));
  }
}
