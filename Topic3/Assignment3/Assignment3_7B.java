public class Assignment3_7B{
  public static void main(String[] args){
    int i = 0;
    while(i < 10){
      int j = 0;
      while(j < 10){
        if(i == 5){
          break;
        }
        System.out.print(i + "-" + j + " ");
        j++;
      }
      System.out.println();
      i++;
    }
  }
}
