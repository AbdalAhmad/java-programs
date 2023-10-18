
public class testb {
public static void main(String[] args) {

// int x = 200, y = 50, z = 100;
// if(x > y && y > z){
// System.out.println("Hello");
// }
// if(z > y && z < x){
// System.out.println("Java");
// }
// if((y+200) < x && (y+150) < z){
// System.out.println("Hello Java");
// }


// int x, y, z;
// x = y = z = 2;
// x += y;
// y -= z;
// z /= (x + y);
// System.out.println(x + " " + y + " " + z);

// int x = 9, y = 12;
// int a = 2, b = 4, c = 6;
// int g =      (3 + y * (2 + a))  ;   // 48+3   //(a + b * c) ;  // multiply first then add 
// int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
// System.out.println(exp);
// System.out.println(g);
int x = 10, y = 5;
int exp1 = (y * (x / y + x / y));  //divide precedence is high then add first bracket 
int exp2 = (y * x / y + y * x / y);
System.out.println(exp1);
System.out.println(exp2);

}

}

