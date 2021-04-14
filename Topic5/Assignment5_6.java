import java.util.ArrayList;
import java.util.function.Predicate;

public class Assignment5_6{
  public static void main(String[] args){
    Cassette cliff = new Cassette();
    cliff.setTitle("Wired for Sound");
    cliff.setArtist("Cliff Richard");
    cliff.setReadOnly(true);

    Cassette liza = new Cassette();
    liza.setTitle("Results");
    liza.setArtist("Liza Minnelli");
    liza.setReadOnly(true);

    Cassette petShop = new Cassette();
    petShop.setTitle("Actually");
    petShop.setArtist("Pet Shop Boys");
    petShop.setReadOnly(false);

    ArrayList<Cassette> myCassettes = new ArrayList<Cassette>();
    myCassettes.add(cliff);
    myCassettes.add(liza);
    myCassettes.add(petShop);

    System.out.println("My Read only cassettes are:");
    displayCatalogue(myCassettes, cassette -> cassette.isReadOnly());

    System.out.println("\nMy Read-Write Cassettes are: ");
    displayCatalogue(myCassettes, cassette -> !cassette.isReadOnly());

  }

  public static void displayCatalogue(ArrayList<Cassette> cassettes, Predicate<Cassette> checker){
    for(Cassette cassette:cassettes){
      if(checker.test(cassette)){
        System.out.println(cassette);
      }
    }
  }
}
