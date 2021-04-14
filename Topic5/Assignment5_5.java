import java.util.ArrayList;

public class Assignment5_5{
  public static void main(String[] args){
    CD bonJovi = new CD("Bon Jovi", "Slippery When Wet", "Mercury Records", "80s");
    CD Allanis = new CD("Alanis Morissette", "Jagged Little Pill", "Maverick Records", "90s");
    CD level1 = new CD("Level 42", "The Pursuit of Accidents", "Polydor", "80s");
    CD level2 = new CD("Level 42", "Running in the Family", "Polydor", "80s");

    ArrayList<CD> cds = new ArrayList<CD>();
    cds.add(bonJovi);
    cds.add(Allanis);
    cds.add(level1);
    cds.add(level2);

    System.out.println("My 80's CD's");
    print(cds, cd -> cd.is80sCD());
  }
  public static void print(ArrayList<CD> cds, CheckAttribute checker){
    for(CD cd:cds){
      if(checker.test(cd)){
        System.out.println(cd);
      }
    }

  }
}
