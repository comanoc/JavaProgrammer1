package packageB;

public class ClassB{
  private static int numOfClass;

  public ClassB(){
    numOfClass++;
  }

  public String toString(){
    return numOfClass + " ClassB object(s) created.";
  }
}
