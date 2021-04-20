public class Fruit{
  private String name;
  private String colour;
  private String origin;

  public Fruit(String name, String colour, String origin){
    this.name = name;
    this.colour = colour;
    this.origin = origin;
  }

  public Fruit(String name, String colour){
    this(name, colour, "N/A");
  }

  public Fruit(String name){
    this(name, "N/A", "N/A");
  }

  public Fruit(){
    this("N/A", "N/A", "N/A");
  }

  public void setName(String name){
    this.name = name;
  }
  public void setColour(String colour){
    this.colour = colour;
  }
  public void setOrigin(String origin){
    this.origin = origin;
  }

  public String getName(){
    return name;
  }
  public String getColour(){
    return colour;
  }
  public String getOrigin(){
    return origin;
  }

  public void peel(){
    System.out.println("Peeling Slowly...");
  }

  @Override
  public String toString(){
    return "Name: " + name + " Colour: " + colour + " Origin: " + origin;
  }
}
