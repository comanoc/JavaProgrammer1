public class Assignment4_5A{
  public static void main(String[] args){
    int[][] sales = {
                      {12000, 13000, 14000, 15000},
                      {13000, 14000, 15000, 16000},
                      {10000, 12000, 15000, 13000}
                    };
    System.out.println("\t Q1 \t Q2 \t Q3 \t Q4");
    for(int year = 0; year<sales.length; year++){
      System.out.print("Year " + (year + 1));
      for(int q = 0; q<sales[year].length; q++){
        System.out.print("\t " + sales[year][q]);
      }
      System.out.println();
    }
  }
}
