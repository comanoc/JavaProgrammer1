import java.util.ArrayList;

public class Assignment4_6B{
  public static void main(String[] args){
    ArrayList<CD> myCDS = new ArrayList<CD>();

    //Step 1
    CD U2 = new CD("Rattle and Hum", "U2", "1988", "Island Records");
    CD Pink_Floyd = new CD("The Dark Side of the Moon", "Pink Floyd", "1973", "Capitol Records");
    myCDS.add(U2);
    myCDS.add(Pink_Floyd);

    //Step 2
    CD Mac = new CD("The Very Best Of Fleetwood Mac", "Fleetwood Mac", "2002", "Warner Bros. Records");
    myCDS.add(1, Mac);

    //Step 3
    CD Alanis = new CD("Alanis Morissette: The Collection", "Alanis Morissette", "2005", "Maverick");
    myCDS.add(2, Alanis);

    //Step 4

    CD album = new CD("The Very Best Of Fleetwood Mac");
    boolean contains = false;
    for(CD cd:myCDS){
      if(cd.equals(album)){
        contains = true;
      }
    }

    System.out.println("Is 'The Very Best Of Fleetwood Mac' in the cd collection? " + contains);
    System.out.println();

    //Step 5
    System.out.println("The CD at index 3 is: ");
    System.out.println(myCDS.get(3));
    System.out.println();

    //Step 6
    for(CD cd:myCDS){
      if(cd.equals(album)){
        myCDS.remove(cd);
        break;
      }
    }

    //Step 7
    System.out.println("There are " + myCDS.size() + " cds in the collection");
    System.out.println();
    //Step 8

    for(CD cd:myCDS){
      System.out.println(cd);
      System.out.println();
    }

  }
}
