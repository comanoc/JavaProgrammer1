public class ECar extends Car{
  public ECar(String manufacturer, String model, String reg){
    super(manufacturer, model, reg);
  }
  public ECar(String manufacturer, String model){
    super(manufacturer, model);
  }
  public String accelerate(){
    return "Accelerating in a " + super.getModel() + "...";
  }
  public String brake(){
    return "Braking in a " + super.getModel() + "...";
  }
  public String recharge(){
    return "Recharging a " + super.getModel() + "...";
  }
}
