public class Assignment4_2A{
  String message = "Dukes big day out!";

  public static void main(String[] args){
    Assignment4_2A obj = new Assignment4_2A();
    String word = "big";

    System.out.println(obj.message.contains(word));

    int index =  obj.message.indexOf(word);
    System.out.println(obj.message.substring(index, (index + word.length())));

    obj.message = obj.message.replace(word, "magical");
    System.out.println(obj.message);
  }
}
