public class testa{
public static void main(String[] args){
int x = 2, y = 5;
int exp1 = (x * y / x);  //not bodmas first one will done left to right and multiply precendence is high then divide
int exp2 = (x * (y / x)); // bodmas 
System.out.print(exp1);
System.out.print("  ");
System.out.print(exp2);
}
}