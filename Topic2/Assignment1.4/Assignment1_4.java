import com.javadevelopers.code.Calculator;
import java.util.Scanner;
import java.util.ArrayList;

public class Assignment1_4{
  public static void main(String[] args){
      Calculator calc = new Calculator();
      Scanner input = new Scanner(System.in);
      boolean valid = false;

      while(!valid){
        try{
          System.out.println("Enter the First number: ");
          float test = input.nextFloat();
          calc.setNo1(test);
          valid = true;
        }catch(Exception InputMismatchException){
          System.out.println("Not a valid number");
          input.nextLine();
        }
      }

      valid = false;
      while(!valid){
        try{
          System.out.println("Enter the Second number: ");
          float test = input.nextFloat();
          input.nextLine();
          calc.setNo2(test);
          valid = true;
        }catch(Exception InputMismatchException){
          System.out.println("Not a valid number");
          input.nextLine();
        }
      }
      valid = false;
      while(!valid){
        System.out.println("Enter the operator: ");
        String test = input.nextLine();
        ArrayList<String> validOperations = new ArrayList<String>();
        validOperations.add("+");
        validOperations.add("-");
        validOperations.add("*");
        validOperations.add("/");
        validOperations.add("%");

        if(validOperations.contains(test)){
          calc.setOperator(test);
          valid = true;
        }else{
          System.out.println("Invalid Operator");
        }
      }
      System.out.println(calc.getNo1() + " " + calc.getOperator() + " " + calc.getNo2() +
                        " = " + calc.performCalculation());
  }
}
