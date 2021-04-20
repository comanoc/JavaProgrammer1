public class Corn extends Vegetable{
  public Corn(String name, String family){
    super(name, family);
  }
  public Corn(String name){
    super(name, "N/A");
  }
  public Corn(){
    super("N/A", "N/A");
  }

  public void cook(){
    super.cook();
    System.out.println("Add in butter and salt...");
  }
}
