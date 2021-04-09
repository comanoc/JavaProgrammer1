public class Assignment4_3B{
  public static void main(String[] args){
    Friend Sandy = new Friend("Sandy", "Smith", "0864545321", "sandysmith@livemail.com");
    Friend Ben = new Friend("Ben", "Jones", "0864152412", "jonesben@livemail.com");

    Friend[] friends = {Sandy, Ben};
    System.out.println("My friends are: ");
    for(int i = 0; i<friends.length; i++){
      System.out.println(friends[i]);
    }
  }
}
class Friend{
  private String firstName;
  private String lastName;
  private String phoneNo;
  private String emailAddress;

  public Friend(String firstName, String lastName, String phoneNo, String emailAddress){
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNo = phoneNo;
    this.emailAddress = emailAddress;
  }

  public String toString(){
    return "First Name: " + firstName + "\n"
        +  "Last Name : " + lastName + "\n"
        +  "Phone No  : " + phoneNo + "\n"
        +  "Email     : " + emailAddress + "\n";
  }
}
