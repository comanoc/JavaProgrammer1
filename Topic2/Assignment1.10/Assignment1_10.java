import java.util.ArrayList;
import java.util.Scanner;
import java.io.Console;

public class Assignment1_10{
  public static void main(String[] args){
    ArrayList<Account> accounts = new ArrayList<Account>();
    accounts.add(new Account(45646432, 3435, "Julian", "King", 100));
    accounts.add(new Account(48593741, 8246, "Anne", "Williams", 200));
    accounts.add(new Account(15432432, 6157, "Derek", "James", 300));

    ArrayList<Integer> validWidthdrawlAmounts = new ArrayList<Integer>();
    validWidthdrawlAmounts.add(20);
    validWidthdrawlAmounts.add(40);
    validWidthdrawlAmounts.add(60);
    validWidthdrawlAmounts.add(80);
    validWidthdrawlAmounts.add(100);
    validWidthdrawlAmounts.add(200);

    Console cons = System.console();

    Scanner input = new Scanner(System.in);
    boolean valid = false;

    while(!valid){
      try{
        System.out.println("Enter your account number: ");
        char[] acno = cons.readPassword("[%s]", "Account Number:");
        int accountNo = Integer.parseInt(new String(acno));
        System.out.println("Enter your PIN: ");
        char[] passwd = cons.readPassword("[%s]", "PIN:");
        int pin = Integer.parseInt(new String(passwd));
        int count = 0;
        for(Account account:accounts){
          if(account.getAccountNo() == accountNo){
            if(account.getPIN() == pin){
              boolean validInput = false;
              while(!validInput){
                try{
                  System.out.println("The maximum withdrawl amount is 200 Euro");
                  System.out.println("Enter an amount: 20 : 40 : 60 : 80: 100: 200");
                  int widthdrawl = input.nextInt();
                  if(validWidthdrawlAmounts.contains(widthdrawl)){
                    if (widthdrawl > account.getBalance())
                    {
                      System.out.println("Insufficient funds. \n"
                                      +  "Existing balance: " + account.getBalance());
                      validInput = true;
                    }else{
                      account.widthdrawl(widthdrawl);
                      System.out.println("Cash dispensed: " + widthdrawl + "\n"
                                      +  "Your new balance is: " + account.getBalance());
                      valid = true;
                    }
                  }
                }catch(Exception InputMismatchException){
                  System.out.println("Not a valid number");
                  input.nextLine();
                }
              }
            }
          }
          count++;
        }
        if(count == accounts.size()){
          System.out.println("Invalid account number or pin\n");
        }

      }catch(Exception err){
        System.out.println("Incorrect format of Account number or PIN. Please try again!");
      }
    }

    System.out.println("Hava a nice day");
  }
}
