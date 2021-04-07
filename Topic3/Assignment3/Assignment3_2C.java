public class Assignment3_2C{
  public static void main(String[] args){
    int noLoyaltyPoints = 260;
    String msg = "You have earned ";

    if(noLoyaltyPoints < 150){
      msg += "no gift";
    }else if(noLoyaltyPoints < 251){
      msg += "€35 off your next shopping bill!";
    }else if(noLoyaltyPoints < 351){
      msg += "€50 off your next shopping bill!";
    }else {
      msg += "€75 off your next shopping bill!";
    }
    System.out.println(msg);
  }
}
