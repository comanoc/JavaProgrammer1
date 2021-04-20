public class Vegetable{
  private String name;
  private String family;

  public Vegetable(String name, String family){
    this.name = name;
    this.family = family;
  }
  public Vegetable(String name){
    this(name, "N/A");
  }
  public Vegetable(){
    this("N/A", "N/A");
  }

  public void setName(String name){
    this.name = name;
  }
  public void setFamily(String family){
    this.family = family;
  }

  public String getName(){
    return name;
  }
  public String getFamily(){
    return family;
  }

  public void cook(){
    System.out.print("\nName: " + name + "Family: " + family + "\n"
                  + "To cook: Add to boiling water and leave to simmer for 20 minutes.\n");
  }
}
