public class Assignment5_7A{
 int x = 3;
 public static void main(String[] args){
 Assignment5_7A object = new Assignment5_7A();
 int x = 7;
 object.changeIt(x);
 System.out.println(x); // 7

 Assignment5_7A obj = new Assignment5_7A();
 Assignment5_7A obj2 = new Assignment5_7A();
 obj.x = 3;
 obj2.x = 9;
 obj = obj2;
 obj.changeIt(obj2);
 System.out.println(obj.x); // 900
 System.out.println(obj2.x); // 900

}
public void changeIt(int param){
 param++;
}
public void changeIt(Assignment5_7A obj){
 obj.x = 900;
}
}
/*
The first change it gets a copy of the variable x and changes that.
The second change it gets a copy of the reference obj2. It then acts
on the obects itself which is changed for all variables pointing to that object. 
*/
