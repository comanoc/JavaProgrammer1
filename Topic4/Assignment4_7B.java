import java.time.LocalDate;

public class Assignment4_7B{
  public static void main(String[] args){
    LocalDate ld = LocalDate.of(2018, 1, 1);
    System.out.println("Date constructed: " + ld);
    ld = ld.plusDays(7);
    System.out.println("Add Seven days: " + ld);
    ld = ld.plusWeeks(4);
    System.out.println("Add 4 weeks: " + ld);
    ld = ld.plusMonths(6);
    System.out.println("Add 6 months: " + ld);
    ld = ld.plusYears(2);
    System.out.println("Add 2 years: " + ld);
  }
}
