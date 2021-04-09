public class Assignment4_2B{
  String message = "One, two, buckle my shoe";

  public static void main(String[] args){
    Assignment4_2B obj = new Assignment4_2B();
    String message = obj.message;

    System.out.println(message.indexOf("buckle"));
    System.out.println(message.endsWith("shoe"));
    System.out.println(message.charAt(2));

  }
}
