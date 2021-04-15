public class Assignment5_9{
  public static void main(String[] args){
    CalculateRemainder remain = new CalculateRemainder();
    System.out.println("Mod operation on two bytes: 100 and 6: Result " + remain.remainder((byte)(100), (byte)(6)));
    System.out.println("Mod operation on two shorts: 100 and 6: Result " + remain.remainder((short)(100), (short)(6)));
    System.out.println("Mod operation on two ints: 100 and 6: Result " + remain.remainder(100, 6));
    System.out.println("Mod operation on two longs: 100 and 6: Result " + remain.remainder(100L, 6L));
  }
}
