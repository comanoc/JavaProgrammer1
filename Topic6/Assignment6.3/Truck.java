public abstract class Truck{
  private String manufacturer;
  private String model;
  private float price;
  private float engineSize;

  public Truck(String manufacturer, String model, float price, float engineSize){
    this.manufacturer = manufacturer;
    this.model = model;
    this.price = price;
    this.engineSize = engineSize;
  }
  public Truck(String manufacturer, String model, float price){
    this(manufacturer, model, price, 0.0f);
  }
  public Truck(String manufacturer, String model){
    this(manufacturer, model, 0.0f, 0.0f);
  }
  public Truck(String manufacturer){
    this(manufacturer, "N/A", 0.0f, 0.0f);
  }
  public Truck(){
    this("N/A", "N/A", 0.0f, 0.0f);
  }

  public void setManufacturer(String manufacturer){
    this.manufacturer = manufacturer;
  }
  public void setModel(String model){
    this.model = model;
  }
  public void setPrice(float price){
    this.price = price;
  }
  public void setEngineSize(float engineSize){
    this.engineSize = engineSize;
  }

  public String getManufacturer(){
    return manufacturer;
  }
  public String getModel(){
    return model;
  }
  public float getPrice(){
    return price;
  }
  public float getEngineSize(){
    return engineSize;
  }

  public abstract void accelerate();

  public abstract void brake();

  public void tuneRadio(){
    System.out.println("Radio tuned in... 'Winding your way down on Baker Street...'");
  }

  public String toString(){
    return          "Manufacturer : " + manufacturer + "\n"
                  + "Model        : " + model + "\n"
    + String.format("Price        : %.2f%n", price)
                 +  "Engine Size  : " + engineSize + "\n";
  }
}
