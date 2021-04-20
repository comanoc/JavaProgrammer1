import java.util.ArrayList;

public class Assignment6_1{
  public static void main(String[] args){
    ArrayList<Fruit> fruits = new ArrayList<Fruit>();

    Fruit orange = new Fruit("Orange", "orange", "Spain");
    Fruit banana = new Fruit("Banana", "yellow", "Ecuador");

    fruits.add(orange);
    fruits.add(banana);

    for(Fruit fruit:fruits){
      System.out.println(fruit);
      fruit.peel();
      System.out.println();
    }
  }
}
