public class ICECar extends Car{
  public ICECar(String manufacturer, String model, String reg){
    super(manufacturer, model, reg);
  }
  public ICECar(String manufacturer, String model){
    super(manufacturer, model);
  }
  public String accelerate(){
    return "Accelerating in a " + super.getModel() + "...";
  }
  public String brake(){
    return "Braking in a " + super.getModel() + "...";
  }
  public String refuel(){
    return "Refuelling a " + super.getModel() + "...";
  }
}
