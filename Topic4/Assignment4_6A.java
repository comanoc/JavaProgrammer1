import java.util.ArrayList;

public class Assignment4_6A{
  public static void main(String[] args){
    ArrayList<String> stars = new ArrayList<String>();

    stars.add("Elvis Presley");
    stars.add("Marilyn Monroe");
    stars.add("James Dean");
    stars.add("Rita Davies");

    stars.add(2, "Cary Grant");

    System.out.println("Is Marilyn Monroe in the list? " + stars.contains("Marilyn Monroe"));
    System.out.println("At index 4 of the list is: " + stars.get(4));
    System.out.println("James Dean is at index: " + stars.indexOf("James Dean"));
    stars.remove("Rita Davies");

    for(String star:stars){
      System.out.println(star);
    }
  }
}
