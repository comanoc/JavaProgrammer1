public class Assignment3_3C{
  public static void main(String[] args){
    String locale = "Ireland";
    String user = "Java Duke";

    String msg  = user + ", ";
    switch(locale){
      case "Ireland":
        msg += "Failte!";
        break;
      case "France":
        msg += "Bienvenue!";
        break;
      case "Germany":
        msg += "Willkommen";
        break;
      case "Spain":
        msg += "Bienvenida";
        break;
      default:
        msg += "Welcome";
        break;
    }
    System.out.println(msg);
  }
}
