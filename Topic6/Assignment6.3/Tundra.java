public class Tundra extends Truck{
  public Tundra(float price, float engineSize){
    super("Toyota", "Tundra", price, engineSize);
  }
  public Tundra(float price){
    super("Toyota", "Tundra", price);
  }
  public Tundra(){
    super("Toyota", "Tundra");
  }

  public void accelerate(){
    System.out.println("Accelerating in a Tundra...");
  }
  public void brake(){
    System.out.println("Braking in a Tundra...");
  }

}
