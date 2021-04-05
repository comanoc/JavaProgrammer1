import java.io.Console;
import java.util.Arrays;

public class PartC{
  public static void main(String[] args){
    String password = "enigma";
    int attempts = 3;


    while(attempts > 0){
      Console cons = System.console();
      char[] passwd = cons.readPassword("[%s]", "Password:");

      if((cons != null) && (passwd != null)){
        String test = new String(passwd);
        if(test.equals(password)){
          System.out.println("Success");
          break;
        }
        else if(attempts == 0){
          System.exit(1);
        }
        else{
          attempts--;
          System.out.println("Invalid Password entered. " + attempts + " attempts remaining");
        }
        Arrays.fill(passwd, ' ');
      }

    }

  }
}
