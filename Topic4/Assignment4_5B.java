public class Assignment4_5B{
  public static void main(String[] args){
    double[][] temps = {
                        {9.0, 9.1, 11.2, 12.0, 14.1, 18.0, 23.0, 21.1, 20.0, 13.0, 10.1, 9.0},
                        {8.0, 8.1, 10.2, 11.0, 14.1, 17.0, 22.0, 22.1, 21.0, 12.0, 11.1, 8.0}
                        };

    System.out.println("Part 1");
    System.out.println("Jan \tFeb \tMar \tApr \tMay \tJun \tJul \tAug \tSep \tOct \tNov \tDec");
    for(int year = 0; year<temps.length; year++){
      for(int month = 0; month<temps[year].length; month++){
        System.out.print(temps[year][month] + "\t" );
      }
      System.out.println();
    }

    System.out.println("Part 2");
    System.out.println("Jan \tFeb \tMar \tApr \tMay \tJun \tJul \tAug \tSep \tOct \tNov \tDec");
    for(double[] year:temps){
      for(double month:year){
        System.out.print(month + "\t" );
      }
      System.out.println();
    }
  }
}
