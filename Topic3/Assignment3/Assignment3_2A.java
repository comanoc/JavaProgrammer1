public class Assignment3_2A{
  public static void main(String[] args){
    float currentTemp = 15.00f;
    String season = "The season is ";
    if(currentTemp < 7){
      season += "Winter";
    }else if(currentTemp < 11){
      season += "Autumn";
    }else if(currentTemp < 16){
      season += "Spring";
    }else{
      season += "Summer";
    }
    System.out.println(season);
  }
}
