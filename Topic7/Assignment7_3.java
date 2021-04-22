import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class Assignment7_3{
  public static void main(String[] args){
    final int MAX_GUESSES = 3;
    final int START = 0;
    final int END = 10;

    boolean found = false;
    int guessesReamining = MAX_GUESSES;
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    int numberToGuess = rand.nextInt(END + 1) + START;

    System.out.print("Play Lucky Number!!!!\n"
                  +  "The progam will generate a random number between" + START + "-" + END + "inclusive\n"
                  +  "You have " + MAX_GUESSES + " guesses to guess the number\n"
                  +  "Good Luck\n\n");

    while((guessesReamining > 0) && (!found)){
      try{
        System.out.println("Your Guess: ");
        int guess = input.nextInt();
        if((guess < START) || (guess > END)){
          throw new InputMismatchException();
        }else if(guess != numberToGuess){
          guessesReamining--;
          System.out.println("Wrong!! Guesses Remaining: " + guessesReamining);
        }else if(guess == numberToGuess){
          found = true;
          System.out.println("You won! The lucky number was " + numberToGuess);
        }
      }catch (InputMismatchException e){
        System.out.println("You must enter a number  between " + START + "-" + END + " inclusive! Try again!");
        input.nextLine();
      }
    }
    if(guessesReamining == 0){
      System.out.println("You Lost. The lucky number was " + numberToGuess);
    }
  }
}
