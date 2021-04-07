public class Assignment2_6{
public static void main(String args[]){
 int x = 11;
 int y = 11;
 System.out.println(x++>y & ++y>x); // false
 /*
x = 11, 12
y = 11, 12
out = 11 > 11 & 12 > 12 = false & false = false
 */
 System.out.print(x + " " + y); // 12 12

 System.out.println("\n");

 int a = 11;
 int b = 11;
 System.out.println(a++>b && ++a>b); //false
/*
a = 11, 12
b = 11
out = 11 > 11 = false not short circuit (&&) so second half not evaluated
*/
 System.out.print(a + " " + b);// 12 11

 System.out.println("\n");

 int c = 11;
 int d = 11;
 System.out.println(c++>d | ++c > ++d); // true
/*
c = 11, 12, 13
d = 11, 12
out = 11 > 11 | 13 > 12 = false | true = true
*/
 System.out.print(c + " " + d); // 13 12

 System.out.println("\n");

 int e = 11;
 int f = 11;
 System.out.println(++e>f || ++e > ++f); // true
 /*
e = 11, 12
f = 11
out = 12 > 11 = true
short circuit or (||) with first part true => second part not looked at
 */
 System.out.print(e + " " + f); // 12 11

 System.out.println("\n");

 int g = 11;
 int h = 11;
 System.out.println(g++>h ^ ++g > ++h); // true
/*
g = 11, 12, 13
h = 11, 12
out = 11 > 11 ^ 13 > 12 = false ^ true = true
*/
 System.out.print(g + " " + h); // 13 12
}
}
