public abstract class Animal{
  private String name;
  private int age;
  private boolean isHungry;

  public Animal(String name, int age, boolean isHungry){
      if(age < 0){
        throw new AgeOutOfBoundsException("Age cannot be less than 0");
      }
      this.name = name;
      this.age = age;
      this.isHungry = isHungry;
  }
  public Animal(){
    this("Unknown", 0, false);
  }

  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){
    if(age < 0){
      throw new AgeOutOfBoundsException("Age cannot be less than 0");
    }
    this.age = age;
  }
  public void setIsHungry(boolean hungry){
    this.isHungry = hungry;
  }

  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public boolean isHungry(){
    return isHungry;
  }

  public abstract String feed();
  public abstract String performTrick();
}

class AgeOutOfBoundsException extends RuntimeException{
  public AgeOutOfBoundsException(String errorMsg){
    super(errorMsg);
  }
}
