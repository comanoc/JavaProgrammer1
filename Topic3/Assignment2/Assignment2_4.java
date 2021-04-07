public class Assignment2_4{
 public static void main(String args[]){
 int c = 3;
 c++; // c = 4
 System.out.println("The value of c is " + c);

 int w = 0;
 w = ++c; // w = 5, c = 5
 System.out.println("The value of w is " + w);
 System.out.println("The value of c is " + c);

 int x = 0;
 x = c++; // x = 5, c = 6
 System.out.println("The value of x is " + x);
 System.out.println("The value of c is " + c);

 int y = 0;
 y = --c; // y = 5, c = 5
 System.out.println("The value of y is " + y);
 System.out.println("The value of c is " + c);

 final int z = 10;
 int q = ++z; // compiler error as z is final

 // if z was not final z = 11, q = 11
 System.out.println("The value of z is " + z);
 System.out.println("The value of q is " + q);
 }
}
