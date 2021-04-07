public class Assignment2_8{
 public static void main(String[] args){
 int x = 10;
 int y = 12;

 System.out.println(x>y); // false
 System.out.println(x>=y); // false
 System.out.println(x<y); // true
 System.out.println(x<=y); // true
 System.out.println(x==y); // false
 System.out.println(x!=y); // true
 System.out.println("***********");
 boolean a = true;
 boolean b = false;
 System.out.println(10 == 10);// true
 System.out.println('c' == 'b'); // false
 System.out.println(a == b); // false
 System.out.println("***********");
 Cat c = new Cat();
 c.name = "Whiskers";
 Cat d = new Cat();
 d.name = "Tom";
 System.out.println(c == d); // false
 System.out.println(c != d); // true
 }
}
class Cat{
String name;
}
