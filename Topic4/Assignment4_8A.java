import java.time.LocalDate;

public class Assignment4_8A{
  public static void main(String[] args){
    LocalDate ld = LocalDate.of(2017, 1, 1);

    for(int i = 0; i < 12; i++){
      System.out.println(ld);
      ld = ld.plusMonths(1);
    }
    System.out.println();
    ld = ld.plusDays(1);
    for(int i = 0; i<12; i++){
      ld = ld.minusMonths(1);
      System.out.println(ld);
    }
    System.out.println();
    ld = ld.minusDays(1);
    System.out.println(ld);
    ld = ld.plusMonths(6);
    System.out.println(ld);
  }
}
