public abstract class Car{
  private String manufacturer;
  private String model;
  private String reg;

  public Car(String man, String mod, String reg){
    this.manufacturer = man;
    this.model = mod;
    this.reg = reg;
  }
  public Car(String man, String mod){
    this(man, mod, "N/A");
  }

  public void setManufacturer(String man){
    this.manufacturer = man;
  }
  public void setModel(String mod){
    this.model = mod;
  }
  public void setReg(String reg){
    this.reg = reg;
  }

  public String getManufacturer(){
    return manufacturer;
  }
  public String getModel(){
    return model;
  }
  public String getReg(){
    return reg;
  }


  public String turnOnRadio(){
    return "Radio turned on and tuned in";
  }

  @Override
  public String toString(){
    return "Manufacturer : " + manufacturer + "\n"
        +  "Model        : " + model + "\n"
        +  "Registration : " + reg;
  }

  public abstract String brake();
  public abstract String accelerate();
}
