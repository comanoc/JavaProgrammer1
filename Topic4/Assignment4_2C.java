public class Assignment4_2C{
  String messageOne = "Java Duke";
  String messageTwo = "java duke";

  public static void main(String[] args){
    Assignment4_2C obj = new Assignment4_2C();
    System.out.println(obj.messageOne.equalsIgnoreCase(obj.messageTwo));
  }
}
