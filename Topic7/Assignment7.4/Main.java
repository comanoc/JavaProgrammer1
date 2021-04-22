import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    final String word = "Amazing";
    int count = wordFrequency(word);
    System.out.println("Word frequency of " + word + " (ignoring case) is: " + count);
  }
  public static int wordFrequency(String wordToCount){
    int count = 0;
    String lowerCaseWord = wordToCount.toLowerCase();
    try{
      File textFileToSearch = new File("Duke.txt");
      Scanner buffer = new Scanner(textFileToSearch);
      while(buffer.hasNextLine()){
        if(buffer.nextLine().toLowerCase().contains(lowerCaseWord)){
          count++;
        }
      }
      buffer.close();
    } catch (FileNotFoundException e){
      System.out.println("File to search was not found");
    }
    return count;
  }
}
