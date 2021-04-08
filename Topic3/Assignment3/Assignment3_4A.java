public class Assignment3_4A{
  public static void main(String[] args){
    byte[] myBytes = new byte[10];
    for(int i = 0; i < 10; i++){
      myBytes[i] = (byte)(i + 1);
    }
    for(byte i:myBytes){
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
