import java.util.Scanner;

public class Assignment3_9{
  public static void main(String[] args){
    String[][] userDetails = {
                              {"JavaDuke", "StackOverflow"},
                              {"JavaBean", "VirtualMachine"},
                              {"TheNullPointer", "LossyPrecision"},
                              };

    Scanner input = new Scanner(System.in);
    boolean valid = false;
    final int MAX_ATTEMPTS = 3;
    int attempts = 0;

    OUTERDOLOOP: do{
    System.out.println("Enter your username: ");
    String username = input.nextLine();

    System.out.println("Enter your Password: ");
    String password = input.nextLine();

    INNERFORLOOP: for(int i = 0; i < userDetails.length; i++){
      if(userDetails[i][0].equals(username)){
        if(userDetails[i][1].equals(password)){
          valid = true;
          break OUTERDOLOOP;
        }else{
          break INNERFORLOOP;
        }
      }
      }
      attempts++;
      System.out.println("Invalid login details. " + (MAX_ATTEMPTS - attempts) + " attempt(s) remaining.");
    }while(attempts < MAX_ATTEMPTS);

    if(valid){
      System.out.println("Login Successful!");
    }else{
      System.out.println("Login Failed!");
    }
}
}
