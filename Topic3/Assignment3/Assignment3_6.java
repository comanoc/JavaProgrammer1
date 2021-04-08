import java.util.ArrayList;

public class Assignment3_6{
  public static void main(String[] args){
      ArrayList<String> names = new ArrayList<String>();
      names.add("Fred Smith");
      names.add("Helena Davis");
      names.add("Brian Burrows");
      names.add("Jane Beagles");

      System.out.println("The following people have booked their place on the trip:");
      for(String name:names){
        System.out.println(name);
      }
  }
}
