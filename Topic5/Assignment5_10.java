public class Assignment5_10{
  public static void main(String[] args){
    Banana foffs = new Banana("Foffs", 1.40f);
    Banana toffs = new Banana("Toffs", 2.00f);
    Banana mushies = new Banana("Mushies", 1.20f);

    System.out.println(foffs.getNumBananas() + " Bananas have been created.");
    System.out.printf("The average price of a banana is %.2f%n", foffs.getAvgPrice());
  }
}
