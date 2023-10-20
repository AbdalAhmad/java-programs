// swap a value exchange - call value

public class temp{

public static int swap(int n, int m){
 int temp = n; // a value 5 store in temp
          n= m ; // b value 10 store in a
          m = temp ; // b store value of  temp  5
           System.out.println("new value of a = "+n);
         System.out.println("new value of b = "+m);  // functionality  is written here 
  return temp;  // change value come here only and store here only
}

    public static void main(String [] args){
        int a = 5;
        int b = 10;  // variable decalare here actual argument 
         
        System.out.println("a = "+a);
         System.out.println("b = "+b);
         int finalr =    swap(a,b);  // it create a copy 
   
      

    }
}


