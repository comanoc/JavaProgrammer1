import java.time.*;

public class Assignment4_7A{
  public static void main(String[] args){
    System.out.println("Today's date: " + LocalDate.now());
    System.out.println("Current time: " + LocalTime.now());
    System.out.println("Current date and time: " + LocalDateTime.now());
    System.out.println("Contructed DateTime: " + LocalDateTime.of(2017, Month.DECEMBER, 25, 13, 00, 05));
  }
}
