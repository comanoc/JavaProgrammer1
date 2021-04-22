public class Assignment7_2{
  public static void main(String[] args){
    String qualify = "You qualify for a free bus pass.";
    String doesntQualify = "You are too young to qualify for a free bus pass.";
    int age = Integer.parseInt(args[0]);

    String output = ((age >= 65)? qualify : doesntQualify);
    System.out.println(output);
  }
}

/*
• What is the name of the exception that will be generated?
Ans: ArrayIndexOutOfBoundsException
If the user enters an incorrect variable type we would get a NumberFormatException

• Should we handle or declare the exception?
Ans: We should handle it as we are taking user input for the program to run.
The user could enter many invalid things

• Is the exception considered a checked or an unchecked exception?
Ans: Unchecked as we don't have to declare it to compile

*/
