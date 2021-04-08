public class Assignment3_5A{
  public static void main(String[] args){
    byte[] myBytes = new byte[10];
    int i = 0;
    while(i < 10){
      myBytes[i] = (byte)(i + 1);
      i++;
    }
    i = 0;
    while(i < 10){
      System.out.print(myBytes[i] + " ");
      i++;
    }
    System.out.println();
  }
}
