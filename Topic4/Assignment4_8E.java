import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Assignment4_8E{
  public static void main(String[] args){
    String mensTennisFinal = "07 16 2017";
    LocalDate mensTennisFinalDate = LocalDate.parse(mensTennisFinal, DateTimeFormatter.ofPattern("MM dd yyyy"));

    System.out.println("The 2017 Wimbledon Nens tennis final took place on: " + mensTennisFinalDate);
  }
}
