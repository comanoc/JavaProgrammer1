import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Assignment4_8B{
  public static void main(String[] args){
    LocalDate ld = LocalDate.of(2017, 06, 8);

    System.out.println(DateTimeFormatter.ofPattern("EEEE").format(ld));
    System.out.println(DateTimeFormatter.ofPattern("MMMM").format(ld));
    System.out.println(DateTimeFormatter.ofPattern("yyyy").format(ld));
    System.out.println(DateTimeFormatter.ofPattern("D").format(ld));
  }
}
