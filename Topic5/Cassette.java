public class Cassette{
  private String title;
  private String artist;
  private boolean readOnly;

  public String getTitle(){
    return title;
  }
  public String getArtist(){
    return artist;
  }
  public boolean isReadOnly(){
    return readOnly;
  }

  public void setArtist(String artist){
    this.artist = artist;
  }
  public void setTitle(String title){
    this.title = title;
  }
  public void setReadOnly(boolean readOnly){
    this.readOnly = readOnly;
  }

  public String toString(){
    return "Title     : " + title + "\n"
        +  "Artist    : " + artist + "\n"
        +  "Read Only : " + readOnly + "\n";
  }
}
