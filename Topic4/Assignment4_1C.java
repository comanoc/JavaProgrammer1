public class Assignment4_1C{
  public static void main(String[] args){
    String story = "Duke great adventure";
    String poem = new String("Duke great adventure");
    System.out.println(story == poem);
  }
}
/*

story and poem point to different memory locations
=> story == poem results in false

*/
