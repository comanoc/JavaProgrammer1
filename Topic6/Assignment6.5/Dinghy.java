public class Dinghy extends Inflatable{
  public void inflate(){
    System.out.println("Inflating the dinghy");
    super.inflate();
  }
  public void deflate(){
    System.out.print("Deflate the Dinghy: \n\n"
                  +  "Remove the woooden seat and floor.\n"
                  +  "Deflate the bow camber\n"
                  +  "Attach foot pumps to each of the valves. \n\n");
    super.deflate();
  }
}
