import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Assignment4_8C{
  public static void main(String[] args){
    LocalDate cupStartDate = LocalDate.of(2017,6,17);
    LocalTime kickOffTime = LocalTime.of(18,0,0);

    DateTimeFormatter myDateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    DateTimeFormatter myTimeFormat = DateTimeFormatter.ofPattern("H:mm:ss");

    System.out.println("The Football Cup starts on: " + myDateFormat.format(cupStartDate));
    System.out.println("Russia v New Zealand kicks off at: " + myTimeFormat.format(kickOffTime));
  }
}
