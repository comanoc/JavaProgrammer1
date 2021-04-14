import java.util.ArrayList;

public class Assignment5_4{
  public static void main(String[] args){
    Student james = new Student("James", "Dean", 60.5f);
    Student annie = new Student("Annie", "Francis", 80.5f);
    Student davey = new Student("Davey", "Jones", 40.00f);

    ArrayList<Student> students = new ArrayList<Student>();
    students.add(james);
    students.add(annie);
    students.add(davey);

    System.out.println("List of Students and Grades");
    for(Student student:students){
      System.out.println(student);
    }
    System.out.println("Number of students: " + james.numStudents);
    System.out.printf("Average student grade: %.2f%n", james.gradeAVG);
  }
}
