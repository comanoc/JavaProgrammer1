public class CD{
  private String name;
  private String artist;
  private String yearReleased;
  private String recordLabel;

  public CD(String name, String artist, String year, String recordLabel){
    this.name = name;
    this.artist = artist;
    this.yearReleased = year;
    this.recordLabel = recordLabel;
  }
  public CD(String name, String artist, String year){
    this(name, artist, year, "N/A");
  }
  public CD(String name, String artist){
    this(name, artist, "N/A", "N/A");
  }
  public CD(String name){
    this(name, "N/A", "N/A", "N/A");
  }

  public void setName(String name){
    this.name = name;
  }
  public void setArtist(String artist){
    this.artist = artist;
  }
  public void setYearReleased(String year){
    this.yearReleased = year;
  }
  public void setRecordLabel(String label){
    this.recordLabel = label;
  }

  public String getName(){
    return name;
  }
  public String getArtist(){
    return artist;
  }
  public String getYearReleased(){
    return yearReleased;
  }
  public String getRecordLabel(){
    return recordLabel;
  }
  @Override
  public boolean equals(Object album){
    if(album instanceof CD){
       CD cd = (CD) album;
     if(this.name.equals(cd.name)){
      return true;
      }
    }
    return false;
  }

  public String toString(){
    return "Album          : " + name + "\n"
        +  "Artist         : " + artist + "\n"
        +  "Year           : " + yearReleased + "\n"
        +  "Record Label   : " + recordLabel;
  }
}
