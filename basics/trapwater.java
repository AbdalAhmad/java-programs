import java.util.Scanner;
public class trapwater{
    public static int trap (int height []){
 int n = height.length;

 int res = 0, l=0, r = n-1;
 int rMax = height[r]  , lMax = height[l]; 
 while(l<r){  // true 
    if(lMax<rMax){
     l++;  // left 
   lMax = Math.max(lMax, height[l]); 
   res += lMax - height[l]; // for left
    }else{
        r--; //right 
        rMax = Math.max(rMax, height[r]);
        res += rMax - height[r];  // for right 
    }
 }
  return res;
    }
    public static void main (String [] args){
   int height [] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
   System.out.println(trap(height));

    }
}

//Given n non-negative integers representing an elevation map where the width of

// each bar is 1, compute how much water it can trap after raining.