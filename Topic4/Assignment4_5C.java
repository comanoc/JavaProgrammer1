public class Assignment4_5C{
  public static void main(String[] args){
    String[][] colours = {
                          {"green", "white", "orange"},
                          {"red", "white", "blue", "yellow", "black", "green"}
                          };


    for(String[] innerArrays:colours){
      for(String colour:innerArrays){
        System.out.print(colour + "\t");
      }
      System.out.println();
    }
  }
}
