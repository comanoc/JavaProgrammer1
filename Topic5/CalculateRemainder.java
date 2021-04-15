public class CalculateRemainder{
  // Could obviously be done a lot lot easier with % operator but felt question meant not to use that!
  public byte remainder(byte a, byte b){
    byte posA = (byte)(Math.abs(a)); // Making sure it works for positve and negative numbers
    byte posB = (byte)(Math.abs(b));
    byte temp = (byte)(posA / posB); // Automatically rounds down
    byte remainder = (byte)((posA) - (posB * temp)); // multiplying by b by temp gets closest int
    return remainder;
  }
  public short remainder(short a, short b){
    short posA = (short)(Math.abs(a)); // Making sure it works for positve and negative numbers
    short posB = (short)(Math.abs(b));
    short temp = (short)(posA / posB); // Automatically rounds down
    short remainder = (short)(posA - (posB * temp)); // multiplying by b by temp gets closest int
    return remainder;
  }
  public int remainder(int a, int b){
    int posA =  Math.abs(a); // Making sure it works for positve and negative numbers
    int posB =  Math.abs(b);
    int temp = posA / posB; // Automatically rounds down
    // No need for casts with int as calculations will return int
    int remainder = (posA - (posB * temp)); // multiplying by b by temp gets closest int
    return remainder;
  }
  public long remainder(long a, long b){
    long posA =  Math.abs(a); // Making sure it works for positve and negative numbers
    long posB =  Math.abs(b);
    long temp = posA / posB; // Automatically rounds down
    long remainder = (posA - (posB * temp)); // multiplying by b by temp gets closest int
    return remainder;
  }
}
