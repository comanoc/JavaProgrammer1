import java.util.Comparator;

public class ManagerComparator implements Comparator<Manager>{
  @Override
   public int compare(Manager man1, Manager man2) {
     return Integer.compare(man2.getSalary(), man1.getSalary());
   }
}
