public class AnimalKeeper{
  public String feed(Animal animal){
    return animal.isHungry()? animal.feed(): animal.performTrick();
  }
}
