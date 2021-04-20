public interface Communicatable{
  public void makeCall(String noToDial);
  public void receiveCall(String incomingPhoneNo);
  public void sendText(String msg, String noToText);
  public void receiveText(String msg, String incomingPhoneNo);
  public void recharge(boolean status);
  public void hangUp();
}
