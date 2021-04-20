public class Elephant extends Animal{
  public Elephant(String name, int age, boolean hungry){
    super(name, age, hungry);
  }
  public Elephant(){
    super();
  }
  public String feed(){
    return "Elephant " + super.getName() + " is being fed, he eats hay.";
  }
  public String performTrick(){
    return "Elephant " + super.getName() + " blows with his trunk!";
  }
}
