public class Cake{
  private String name;
  private String toppings;
  private float noOfCalories;

  public Cake(String name, String toppings, float noOfCalories){
    this.name = name;
    this.toppings = toppings;
    this.noOfCalories = noOfCalories;
  }

  public void setName(String name){
    this.name = name;
  }
  public void setToppings(String toppings){
    this.toppings = toppings;
  }
  public void setNoOFCalories(float noOfCalories){
    this.noOfCalories = noOfCalories;
  }

  public String getName(){
    return name;
  }
  public String getToppings(){
    return toppings;
  }
  public float getNoOfCalories(){
    return noOfCalories;
  }

  @Override
  public String toString(){
    return "Name     : " + this.name + "\n"
        +  "Toppings : " + this.toppings + "\n"
        +  "Calories : " + this.noOfCalories; 
  }
}
