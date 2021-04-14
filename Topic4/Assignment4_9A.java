public class Assignment4_9A{
  public static void main(String[] args){
    StringBuilder myStringBuilder = new StringBuilder("Learning Java is fun");
    myStringBuilder.append(" and rewarding");

    System.out.println(myStringBuilder);

    String word = "Java ";
    int wordLen = word.length();
    int pos = myStringBuilder.indexOf(word);
    myStringBuilder.insert((pos + wordLen), "programming ");

    System.out.println(myStringBuilder);

    myStringBuilder.delete(pos, pos + wordLen);
    System.out.println(myStringBuilder);

    myStringBuilder.reverse();
    System.out.println(myStringBuilder);

    myStringBuilder.reverse();
    System.out.println(myStringBuilder.toString());
  }
}
