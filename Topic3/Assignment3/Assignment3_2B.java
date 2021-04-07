public class Assignment3_2B{
  public static void main(String[] args){
    int pointsWon = 44;
    String msg = "The team has ";

    if(pointsWon < 40){
      msg += "been relegated";
    }else if(pointsWon < 50){
      msg += "finished in the lower-half of the table but has avoided relegation";
    }else if(pointsWon < 57){
      msg += "finished in mid-table";
    }else if(pointsWon < 65){
      msg += "qualified for the Europa League";
    }else{
      msg += "qualified for the Champions League";
    }
    System.out.println(msg);
  }
}
