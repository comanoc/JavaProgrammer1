public class Peach{
  private float price;
  static int numOfClass;
  static float totalPrice;
  static float avgPrice;

  public Peach(float setPrice){
      price = setPrice;
      numOfClass++;
      totalPrice += setPrice;
      avgPrice = totalPrice / numOfClass;
  }
  public String toString(){
    return numOfClass + " Peach object(s) have been created. \n"
          + "The average price of a peach is: " + avgPrice;
  }
}
