package packageA;

public class ClassA{
  private static int numOfClass;

  public ClassA(){
    numOfClass++;
  }

  public String toString(){
    return numOfClass + " ClassA object(s) created.";
  }
}
