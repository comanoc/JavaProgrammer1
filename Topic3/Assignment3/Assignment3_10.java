import java.io.Console;

public class Assignment3_10{
  public static void main(String[] args){
    final int numbersRequired = 6;
    int[] numbers = new int[numbersRequired];
    Console cons = System.console();
    boolean valid = false;
    boolean confirmed = false;
    do{
      String userInput = cons.readLine("Enter your 6 lotto numbers [1 - 36 inclusive]. Put a space between numbers. Press enter when finished.: ");
      String[] userInputArray = userInput.split(" ");
      if(userInputArray.length != numbersRequired){
        System.out.println("Please enter " + numbersRequired + " numbers");
      }else{
        int number;
        MAINFORLOOP: for(int i = 0; i < numbersRequired; i++){
          try{
            number = Integer.parseInt(userInputArray[i]);
            if((1 <= number) && (number <= 36)){
              for(int j = 0; j < i; j++){
                if(numbers[j] == number){
                  System.out.println("Cannot have duplicate numbers");
                  break MAINFORLOOP;
                }
              }
              numbers[i] = number;
              if(i == (numbersRequired - 1)){
                valid = true;
              }
            }else{
              System.out.println("Only numbers between 1 and 36 inclusive");
              break;
            }

          }catch(NumberFormatException e){
            System.out.println("Please enter valid numbers only");
            break;
          }
        }
      }
      if(valid){
        System.out.print("Thank you. You entered: ");
        for(int digit:numbers){
          System.out.print(digit + " ");
        }
        System.out.print("Is this correct?");
        userInput = cons.readLine("Enter Y or N:");
        if(userInput.equals("Y")||userInput.equals("y")){
          confirmed = true;
        }else{
          valid = false;
        }
      }
    }while(!confirmed);
    System.out.println("Best of luck in the draw!");
  }
}
