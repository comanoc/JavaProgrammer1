public class Assignment3_3B{
  public static void main(String[] args){
    steakCooked steak = steakCooked.RARE;
    System.out.print("Steak served ");
    switch(steak){
      case RARE:
        System.out.print("with a Cool RED centre");
        break;
      case MEDIUM_RARE:
        System.out.print("with a Hot RED centre");
        break;
      case MEDIUM:
        System.out.print("Pink throughout");
        break;
      case WELL_DONE:
        System.out.print("Brown and well-cooked throughout");
        break;
    }
    System.out.println();
  }
}
enum steakCooked {
  RARE,
  MEDIUM_RARE,
  MEDIUM,
  WELL_DONE
}
