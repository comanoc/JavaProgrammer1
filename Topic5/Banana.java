public class Banana{
  private String manufacturer;
  private float price;

  private static int numBananas;
  private static float totalPrice;
  private static float avgPrice;

  public Banana(String manufacturer, float price) throws NegativePriceException{
    if(price < 0){
      // Throws custom runtime exception if negative price used
        throw new NegativePriceException("Negative price not allowed");
    }else{
      this.manufacturer = manufacturer;
      this.price = price;
      numBananas++;
      totalPrice += price;
      avgPrice = totalPrice / numBananas;
    }
  }

  public void setManufacturer(String manufacturer){
    this.manufacturer = manufacturer;
  }
  public void setPrice(float price) throws NegativePriceException{
    if(price < 0){
      throw new NegativePriceException("Negative price not allowed");
    }else{
      totalPrice -= this.price; // get rid of old price
      this.price = price;
      totalPrice += price; // add new price
      avgPrice = totalPrice / numBananas; // get new avg
    }
  }

  public String getManufacturer(){
    return manufacturer;
  }
  public float getPrice(){
    return price;
  }
  public int getNumBananas(){
    return numBananas;
  }
  public float getAvgPrice(){
    return avgPrice;
  }


}
//custom runtime exception
class NegativePriceException extends RuntimeException{
  public NegativePriceException(String errorMessage){
    super(errorMessage);
  }
}
