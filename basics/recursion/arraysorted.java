import java.util.Scanner;

public class arraysorted {

  public static boolean isSorted(int arr[], int i) {
    if (i == arr.length - 1) {
      return true; // after this first true it give value true to 3  of 4 and 3 true to 2 
    }
    if (arr[i] > arr[i + 1]) {
      return false; // not sorted
    }
    return isSorted(arr, i + 1); //yeah execute first for top
  }

  public static void main(String args[]) {
    int arr[] = { 1, 2, 3, 4 };
    System.out.println(isSorted(arr, 0));
  }
}
