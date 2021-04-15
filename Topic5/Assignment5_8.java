import java.util.ArrayList;

public class Assignment5_8{
  private ArrayList<Integer> numbers = new ArrayList<Integer>();

  public Assignment5_8(int... inputs){
    for(int number:inputs){
      numbers.add(number);
    }
  }

  public ArrayList<Integer> getNumbers(){
    return new ArrayList<Integer>(numbers);
  }
}


class TestEncapsulation{
  public static void main(String[] args){
    Assignment5_8 test = new Assignment5_8(100,200,300,400);
    ArrayList<Integer> testNumbers = test.getNumbers();
    System.out.println("Copy of the ArrayList");
    for(int number:testNumbers){
      System.out.println(number);
    }
    System.out.println("\nRemoving the Third element");
    testNumbers.remove(3);
    for(int number:testNumbers){
      System.out.println(number);
    }
    System.out.println("\nThe original ArrayList is unchanged:");
    for(int number:test.getNumbers()){
      System.out.println(number);
    }
  }
}
