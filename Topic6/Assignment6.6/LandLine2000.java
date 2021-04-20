public class LandLine2000 extends Phone implements Communicatable{
  public LandLine2000(){
    super("LandLine2000", 400, 5.6f, 8.5f, 80.5f);
  }

  public void makeCall(String noToDial){
    System.out.println("Dialling number " + noToDial + " on a LandLine2000 phone");
  }

  public void receiveCall(String incomingPhoneNo){
    System.out.println("Incoming call from " + incomingPhoneNo + " on a LandLine2000 phone");
  }

  public void sendText(String msg, String noToText){
    System.out.println("Sending Text: " + msg + "\n"
                    +  "To phone no : " + noToText + " on a LandLine2000 phone");
  }
  public void receiveText(String msg, String incomingPhoneNo){
    System.out.println("Incoming text: " + msg + "\n"
                    +  "Received from: " + incomingPhoneNo + " on a LandLine2000 phone");
  }
  public void recharge(boolean status){
    super.setRecharging(status);
    System.out.println((status)? "LandLine2000 is currently recharging":"LandLine2000 is not charging");
  }
  public void hangUp(){
    System.out.println("Terminating a call on a LandLine2000 phone");
  }
}
