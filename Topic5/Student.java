public class Student{
  public static int numStudents;
  public static float gradeTotal;
  public static float gradeAVG;
  private String firstName;
  private String lastName;
  private float grade;

  public Student(String firstName, String lastName, float grade){
    this.firstName = firstName;
    this.lastName = lastName;
    this.grade = grade;
    numStudents++;
    gradeTotal += grade;
    gradeAVG = gradeTotal / numStudents;
  }
  public Student(String firstName, String lastName){
    this(firstName, lastName, 0.0f);
  }
  public Student(String firstName){
    this(firstName, "N/A", 0.0f);
  }
  public void setFirstName(String name){
    this.firstName = name;
  }
  public void setLastName(String name){
    this.lastName = name;
  }
  public void setGrade(float grade){
    this.grade = grade;
  }
  public String getFirstName(){
    return firstName;
  }
  public String getLastName(){
    return lastName;
  }
  public float getGrade(){
    return grade;
  }
  public String toString(){
    return String.format("First Name: %s%nLast Name : %s\nGrade     : %.2f%n",
                         firstName, lastName, grade);
  }
}
