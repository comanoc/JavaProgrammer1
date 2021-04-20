public class G200 extends Phone implements Communicatable, Streamable{
  public G200(){
    super("G200", 510, 4.5f, 8.6f, 80.5f);
  }

  public void makeCall(String noToDial){
    System.out.println("Dialling number " + noToDial + " on a G200 phone");
  }

  public void receiveCall(String incomingPhoneNo){
    System.out.println("Incoming call from " + incomingPhoneNo + " on a G200 phone");
  }

  public void sendText(String msg, String noToText){
    System.out.println("Sending Text: " + msg + "\n"
                    +  "To phone no : " + noToText + " on a G200 phone");
  }
  public void receiveText(String msg, String incomingPhoneNo){
    System.out.println("Incoming text: " + msg + "\n"
                    +  "Received from: " + incomingPhoneNo + " on a G200 phone");
  }
  public void recharge(boolean status){
    super.setRecharging(status);
    System.out.println((status)? "G200 is currently recharging":"G200 is not charging");
  }
  public void hangUp(){
    System.out.println("Terminating a call on a G200 phone");
  }
  public void streamVideo(){
    System.out.println("Streaming video on a G200 phone");
  }
}
