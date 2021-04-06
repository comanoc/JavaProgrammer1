public class PartA{
  public static void main(String[] args){
    Chicken c1 = new Chicken(); // 1 object on heap
    Chicken c2 = new Chicken(); // 2 objects on heap
    Chicken c3 = c2; // Still 2 objects on heap
    c2=null; // c3 still pointing to second chicken object => not eligible for GC
  } // Line 7 0 objects are eligible for garbage collection now
}

class Chicken{}
