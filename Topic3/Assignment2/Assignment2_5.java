public class Assignment2_5{
public static void main(String args[]){
 byte w = 2.0; // Line 3 compiler error
 short x = (short) 2.0; // Line 4
 int y = (byte) 2.0f; // Line 5
 long z = 2147483648; // Line 6 compiler error, no L at end and too big for literal int

 byte a=100, b=3;
 a+=b;
}
}
// => 2 compiler errors on line 3 and 6
