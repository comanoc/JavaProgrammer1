public class Main{
  public static void main(String[] args){
    ICECar yaris = new ICECar("Toyota", "Yaris", "04C12DNC");
    ECar twizy = new ECar("Renault", "Twizy", "17D17DUB");

    Car[] cars = {yaris, twizy};
    for(Car car:cars){
      System.out.print(car + "\n"
                    +  car.accelerate() + "\n"
                    +  car.turnOnRadio() + "\n"
                    +  car.brake() + "\n");
      if(car instanceof ICECar){
        ICECar c = (ICECar)car;
        System.out.println(c.refuel());
      }else if(car instanceof ECar){
        ECar e = (ECar)car;
        System.out.println(e.recharge());
      }
      System.out.println();
    }
  }
}
