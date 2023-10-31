import java.util.*;

public class insertionsort {

  public static void printa(Integer arr[]) { // object ass Integer int 
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

 
  public static void insertionsort(Integer arr[]){ // object ass Integer int 
    for(int i = 1; i<arr.length-1 ; i++){
      int curr = arr[i]; // store
      int prev = i-1;
      // finding out the correct position to insert
      while(prev>=0 && arr[prev]>curr){
        arr[prev+1]=arr[prev];
        prev--;
      }
      //insertion
      arr[prev+1]=curr;
    }
  }
  public static void main(String args[]) {
    Integer arr[] = { 5, 4, 1, 3, 2 };
  //  Arrays.sort(arr,0,3);
  Arrays.sort(arr,0,3,Collections.reverseOrder());
    // insertionsort(arr);
    printa(arr);  
  }
}
