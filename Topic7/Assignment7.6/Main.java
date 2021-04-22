import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.io.FileWriter;
import java.io.IOException;

public class Main{
  public static void main(String[] args){
    String inputFile = "Dec2016.txt";
    String outputFile = "Analysis.txt";

    ArrayList<Float> temps = getTemps(inputFile);
    float max = Collections.max(temps);
    float min = Collections.min(temps);
    Double average = temps.stream().mapToDouble(a -> a).average().getAsDouble();
    String message = String.format("Average temperature: %.1f%nMin temperature: %.1f%nMax temperature: %.1f%n",
                      average, min, max);

    System.out.println(message);
    writeToFile(outputFile, message);

  }

  public static ArrayList<Float> getTemps(String fileName){
    ArrayList<Float> temps = new ArrayList<Float>();
    try{
      File tempFile = new File(fileName);
      Scanner scan = new Scanner(tempFile);
      while(scan.hasNextLine()){
        String[] data = scan.nextLine().split("-");
        float temp = Float.parseFloat(data[1]);
        temps.add(temp);
      }
      scan.close();
    }catch (FileNotFoundException e){
      System.out.println("Error file not found");
    }
    return temps;
  }

  public static void writeToFile(String fileName, String message){
    try{
      FileWriter writer = new FileWriter(fileName);
      writer.write(message);
      writer.close();
    }catch (IOException e){
      System.out.println("Error");
      e.printStackTrace();
    }
  }
}
