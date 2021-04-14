public class CD{
  private String artist;
  private String title;
  private String label;
  private String decadeOfRelease;

  public CD(String artist, String title, String label, String decadeOfRelease){
    this.artist = artist;
    this.title = title;
    this.label = label;
    this.decadeOfRelease = decadeOfRelease;
  }
  public boolean is80sCD(){
    return (decadeOfRelease.equals("80s"))? true: false;
  }
  public String toString(){
    return "Artist : " + artist + "\n"
        +  "Title  : " + title + "\n"
        +  "Label  : " + label + "\n"
        +  "Decade : " + decadeOfRelease + "\n";
  }
}
interface CheckAttribute{
  boolean test(CD cd);
}
