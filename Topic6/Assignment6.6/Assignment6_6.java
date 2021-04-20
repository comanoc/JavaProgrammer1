import java.util.ArrayList;

public class Assignment6_6{
  public static void main(String[] args){
    LandLine2000 dumbPhone = new LandLine2000();
    dumbPhone.setPoweredOn(true);
    dumbPhone.setRecharging(false);

    G200 smartPhone = new G200();
    smartPhone.setPoweredOn(true);
    smartPhone.setRecharging(false);

    ArrayList<Communicatable> phones = new ArrayList<Communicatable>();
    phones.add(dumbPhone);
    phones.add(smartPhone);

    for(Communicatable phone:phones){
      System.out.println(phone);
      phone.makeCall("0874646372");
      phone.receiveCall("0864546342");
      phone.hangUp();
      phone.sendText("Hi it is very warm", "0874546432");
      phone.receiveText("Lucky you!", "0864545454");
      phone.recharge(true);
      if(phone instanceof G200){
        G200 smart = (G200)(phone);
        smart.streamVideo();
      }
      }
    }
  }
