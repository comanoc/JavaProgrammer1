import java.util.ArrayList;

public class Assignment6_3{
  public static void main(String[] args){
    ArrayList<Truck> trucks = new ArrayList<Truck>();

    Tundra tundra = new Tundra(20000.00f, 2.6f);
    Camaro camaro = new Camaro(22000.00f, 2.8f);

    trucks.add(tundra);
    trucks.add(camaro);

    for(Truck truck:trucks){
      System.out.println(truck);
      truck.accelerate();
      truck.tuneRadio();
      truck.brake();
      System.out.println();
    }
  }
}
