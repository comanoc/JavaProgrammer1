import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Cake lemon = new Cake("Lemon Drizzle", "Lemon icing sugar", 200f);
    Cake fairy = new Cake("Fairy Cake", "Chocolate icing sugar", 400f);
    Cake batten = new Cake("Battenburg", "Chocolate icing sugar", 800f);
    Cake strawb = new Cake("Strawberry Sponge", "Strawberry icing sugar", 215f);

    ArrayList<Cake> cakes = new ArrayList<Cake>();
    cakes.add(lemon);
    cakes.add(fairy);
    cakes.add(batten);
    cakes.add(strawb);

    cakes.stream()
         .filter(c -> c.getNoOfCalories()<=215)
         .forEach(System.out::println);

    System.out.println("\n" + cakes);
  }
}
