public class Camaro extends Truck{
  public Camaro(float price, float engineSize){
    super("Chevrolet", "Camaro", price, engineSize);
  }
  public Camaro(float price){
    super("Chevrolet", "Camaro", price);
  }
  public Camaro(){
    super("Chevrolet", "Camaro");
  }

  public void accelerate(){
    System.out.println("Speeding up in a Camaro...");
  }
  public void brake(){
    System.out.println("Hitting the brakes in a Camaro...");
  }

}
