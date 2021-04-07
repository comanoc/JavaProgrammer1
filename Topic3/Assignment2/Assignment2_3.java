public class Assignment2_3{
 public static void main(String[] args){
 int a = 5;
 a--; // a=4

 System.out.println("The value of a is " + a);// 4

 int v = 0;
 v = ++a; //v = 5, a = 5
 System.out.println("The value of v is " + v); // 5
 System.out.println("The value of a is " + a); // 5

 int y = 0;
 y = a++; // y = 5, a = 6
 System.out.println("The value of y is " + y);
 System.out.println("The value of a is " + a);

 int x = 0;
 x = a--; // x = 6, a = 5
 System.out.println("The value of x is " + x);
 System.out.println("The value of a is " + a);

 int r = 0;
 r = --a; // r = 4, a = 4
 System.out.println("The value of r is " + r);
 System.out.println("The value of a is " + a);

 final int h = r--; // h = 4 , r = 3  
 System.out.println("The value of h is " + h);
 System.out.println("The value of r is " + r);
 }
}
