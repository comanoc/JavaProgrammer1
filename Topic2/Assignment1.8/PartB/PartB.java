public class PartB{
  public static void main(String[] args){
    Chicken c1 = new Chicken(); // 2 object on heap
    Chicken c2 = new Chicken(); // 4 objects on heap
    Chicken c3 = c2;
    c2 = null;
    c3 = null; // Nothing pointing to second chicken object so that is now eligible for GC
  } // Line 8 2 objects eligible for GC
}
class Chicken{
  byte[] eggs = {1,2,3,4,5,6,7,8,9,10,11,12};
}
/*
Byte array goes on heap as separte object so each
instance of chiken creates 2 objects on the heap.

When nothing is pointing to the second Chicken object those objects
associated with it are now eligible for GC
*/
