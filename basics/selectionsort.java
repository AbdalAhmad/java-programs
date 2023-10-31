import java.util.Scanner;

public class selectionsort{
    public static void printa(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void selectionsort(int arr []){
        for(int i =0; i<arr.length ;i++){ // term count 5 
            int minPost = i; // store i first 5 abhi 
            for(int j =i+1; j<arr.length ;j++ ){  //4 
                if(arr[minPost]>arr[j]){ //5>4  < we can use this 
                    minPost = j;  //min from unsort  minpost = 1 true all postion i+1  check at all position
                }
            }  // 
            //swap for all postion 
            int temp = arr[minPost] ; // 4
            arr[minPost] = arr[i]; //  line se  
            arr[i] = temp;
          
        }
    }
    public  static void main(String args []){
   int arr [] = {5,4,1,3,2};
   
   selectionsort(arr);  // pehle sort hua phir gya print ke pass line se print hone 
   printa(arr);
    }
}