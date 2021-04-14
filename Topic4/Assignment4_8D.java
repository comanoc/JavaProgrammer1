import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Assignment4_8D{
  public static void main(String[] args){
    LocalDate firstMatchDate = LocalDate.of(2017,6,17);
    LocalDate finalMatchDate = LocalDate.of(2017,07,02);
    LocalTime finalMatchTime = LocalTime.of(21,0,0);
    LocalDateTime finalMatch = LocalDateTime.of(finalMatchDate,finalMatchTime);

    String formattedFirstMatch =  DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(firstMatchDate);

    System.out.println("The first match in the Football cup takes place on: "
                    + formattedFirstMatch);

    String formattedFinalDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(finalMatch);
    String formattedFinalTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).format(finalMatch);

    System.out.println("The Football Cup Final takes place on: " + formattedFinalDate);
    System.out.println("The kick off time of the final is: " + formattedFinalTime);
  }
}
