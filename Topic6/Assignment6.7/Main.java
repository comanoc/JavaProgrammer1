public class Main{
  public static void main(String[] args){
    AnimalKeeper jim = new AnimalKeeper();

    Animal[] animals = new Animal[4];

    Penguin p = new Penguin("Pengy", 2, false);
    Penguin p2 = new Penguin("Flappy", 3, true);
    Elephant e = new Elephant("Nelly", 4, true);
    Elephant e2 = new Elephant("Tiny", 6, false);

    animals[0] = p;
    animals[1] = p2;
    animals[2] = e;
    animals[3] = e2;

    for(Animal animal:animals){
      System.out.println(jim.feed(animal));
    }
  }
}
