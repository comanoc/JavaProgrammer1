public abstract class Phone{
  private String name;
  private int noOfDisplayPixels;
  private float width;
  private float height;
  private float weight;
  private boolean poweredOn;
  private boolean recharging;

  public Phone(String name, int noOfDisplayPixels, float width, float height, float weight){
    this.name = name;
    this.noOfDisplayPixels = noOfDisplayPixels;
    this.width = width;
    this.height = height;
    this.weight = weight;
  }
  public Phone(String name, int noOfDisplayPixels, float width, float height){
    this(name, noOfDisplayPixels, width, height, 0.0f);
  }
  public Phone(String name, int noOfDisplayPixels, float width){
    this(name, noOfDisplayPixels, width, 0.0f, 0.0f);
  }
  public Phone(String name, int noOfDisplayPixels){
    this(name, noOfDisplayPixels, 0.0f, 0.0f, 0.0f);
  }
  public Phone(String name){
    this(name, 0, 0.0f, 0.0f, 0.0f);
  }

  public void setName(String name){
    this.name = name;
  }
  public void setNoOfDisplayPixels(int pixels){
    this.noOfDisplayPixels = pixels;
  }
  public void setWidth(float width){
    this.width = width;
  }
  public void setHeight(float height){
    this.height = height;
  }
  public void setWeight(float weight){
    this.weight = weight;
  }
  public void setPoweredOn(boolean poweredOn){
    this.poweredOn = poweredOn;
  }
  public void setRecharging(boolean recharge){
    this.recharging = recharge;
  }


  public String getName(){
    return name;
  }
  public int getNoOfDisplayPixels(){
    return noOfDisplayPixels;
  }
  public float getWidth(){
    return width;
  }
  public float getHeight(){
    return height;
  }
  public float getWeight(){
    return weight;
  }
  public boolean isPoweredOn(){
    return poweredOn;
  }
  public boolean isRecharging(){
    return recharging;
  }

  public String toString(){
    return          "Name                    : " + name + "\n"
                  + "Number of display pixels: " + noOfDisplayPixels + "\n"
    + String.format("Width                   : %.1f%n", width)
    + String.format("Height                  : %.1f%n", height)
    + String.format("Weight                  : %.1f%n", weight)
                  + "Powered On?             : " + poweredOn + "\n"
                  + "Recharging?             : " + recharging + "\n";
  }
}
