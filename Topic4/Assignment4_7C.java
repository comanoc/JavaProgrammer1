import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Assignment4_7C{
  public static void main(String[] args){
    LocalDate ld = LocalDate.of(2017, 6, 7);
    LocalTime lt = LocalTime.of(11, 20);
    LocalDateTime ldt = LocalDateTime.of(ld, lt);
    System.out.println("Date Constructed: " + ldt);

    ldt = ldt.minusDays(7).minusHours(6).minusSeconds(30);
    System.out.println("New Date: " + ldt);
  }
}
