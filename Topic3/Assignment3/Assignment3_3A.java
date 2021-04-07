public class Assignment3_3A{
  public static void main(String[] args){
    byte posInQ = 3;
    String ticketNo = "12345Z";

    System.out.println("Ticket Number: " + ticketNo);
    switch(posInQ){
      case 1:
      case 2:
      case 3:
        System.out.println("Number in queue: " + posInQ
                        +  " - please approach the front desk");
        break;
      default:
        System.out.println("Number in queue: " + posInQ
                        +  " - please stay seated");
        break;
    }
  }
}
