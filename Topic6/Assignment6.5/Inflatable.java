public abstract class Inflatable{
  private float pressure;
  public void inflate(){
      while(pressure < 100.0f){
        pressure += 10.0f;
        System.out.printf("%.1f%% inflated.%n", pressure);
      }
      System.out.println("The inflation process has been completed.");
    }

  public void deflate(){
    while(pressure > 0.0f){
      pressure -= 10.0f;
      System.out.printf("%.1f%% pressure remaining.%n", pressure);
    }
    System.out.println("The deflation process has been completed.");
  }
}
