public class Penguin extends Animal{
  public Penguin(String name, int age, boolean hungry){
    super(name, age, hungry);
  }
  public Penguin(){
    super();
  }
  public String feed(){
    return "Penguin " + super.getName() + " is being fed, he eats fish from a bucket.";
  }
  public String performTrick(){
    return "Penguin " + super.getName() + " flaps wings";
  }
}
