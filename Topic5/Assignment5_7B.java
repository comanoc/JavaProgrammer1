public class Assignment5_7B{
static int x = 3;
public static void main(String[] args){
 Assignment5_7B obj = new Assignment5_7B();
 obj.x=100;

 Assignment5_7B obj2 = new Assignment5_7B();
 obj2.x=200;

 x = 1000;
 obj.changeIt(x);//1000

 x = 2000;
 obj2.changeIt(x);//2000

 obj.changeIt(obj);//900

 System.out.println(Assignment5_7B.x);// 900
 System.out.println(obj.x); // 900
 System.out.println(obj2.x); // 900
}
public void changeIt(int param){
 x=param;
}
public void changeIt(Assignment5_7B obj){
 obj.x = 900;
}
}
/*
static class variable => same variable shared by all instance of classes
=> when we change one we change it for all
*/ 
