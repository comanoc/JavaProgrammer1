public class Assignment3_7A{
  public static void main(String[] args){
    for(int i = 0; i<10; i++){
      for(int j = 0; j<10; j++){
        if(i == 5){
          break;
        }
        System.out.print(i + "-" + j + " ");
      }
      System.out.println();
    }
  }
}
