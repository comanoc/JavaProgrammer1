class Tree{}
class Oak extends Tree{}
class Camera implements Zoomable{}
class DisposableCamera extends Camera{}
interface Zoomable{}
public class Assignment2_10{
 public static void main(String[] args){
 Tree t = new Tree();
 Oak o = new Oak();
 Camera c = new Camera();
 DisposableCamera d = new DisposableCamera();
 Camera e = new DisposableCamera();
 System.out.println(o instanceof t); // compiler error t is not a class or interface type.
 System.out.println(c instanceof Object); // true
 System.out.println(c instanceof Zoomable); // true
 System.out.println(t instanceof Zoomable); // false
 System.out.println(o instanceof Camera); // compiler error 'incompatible types'.
 System.out.println(d instanceof Zoomable); // true
 System.out.println(e instanceof Camera); // true
 }
}
