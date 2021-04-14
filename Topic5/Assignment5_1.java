import java.util.Scanner;
import java.util.InputMismatchException;

public class Assignment5_1{
  public static void main(String[] args){
    final float convMileToKm = 1.60934f;

    Scanner input = new Scanner(System.in);
    boolean validUnit = false;
    boolean validNum = false;
    boolean km = false;

    while(!validUnit){
      System.out.println("Type in which unit you want to convert from ('km' or 'miles') then press enter: " );
      String unit = input.nextLine();
      if(unit.equalsIgnoreCase("km")){
        km = true;
        validUnit = true;
      }else if(unit.equalsIgnoreCase("miles") || unit.equalsIgnoreCase("mile")){
        validUnit = true;
      }
      else{
        System.out.println("Not a valid unit!");
      }
    }
    while(!validNum){
      System.out.println("Please enter number to convert: ");
      try{
        float number = input.nextFloat();
        if(km){
          System.out.printf("%.2f km is %.3f miles\n", number,  (number / convMileToKm));
        }else{
          System.out.printf("%.2f miles is %.3f km\n", number, (number * convMileToKm));
        }
        validNum = true;
      }catch(InputMismatchException e){
        System.out.println("Please enter a valid number!");
        input.nextLine();
      }
    }

  }
}
