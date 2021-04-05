import java.util.ArrayList;
import java.util.Collections;

public class PartB{
  public static void main(String[] args){
  ArrayList<String> members = new ArrayList<String>();
  members.add("John");
  members.add("Paul");
  members.add("George");
  members.add("Ringo");

  Collections.sort(members);

  for(String member:members){
    System.out.print(member + " ");
  }
  System.out.println();
  }
}
