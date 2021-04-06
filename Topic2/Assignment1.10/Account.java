public class Account{
  private int accountNo;
  private int pin;
  private String firstName;
  private String lastName;
  private int balance;

  public Account(int acNum, int Pin, String first, String last, int balance){
    this.accountNo = acNum;
    this.pin = Pin;
    this.firstName = first;
    this.lastName = last;
    this.balance = balance;
  }

  public int getAccountNo(){
    return accountNo;
  }

  public int getPIN(){
    return pin;
  }

  public String getFirstName(){
    return firstName;
  }

  public String getLastName(){
    return lastName;
  }

  public int getBalance(){
    return balance;
  }

  public void widthdrawl(int money){
    this.balance -= money;
  }
}
