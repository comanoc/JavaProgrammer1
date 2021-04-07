public class Assignment2_7{
 public static void main(String args[]){
 // Ticket Sales
 int age = 12;
 double ticketPrice = (age<12) ? 4.50 : 12.50;
 System.out.println(ticketPrice); // 12.5

 // Gold Coins
 boolean isCaptain = true;
 int goldCoins = (isCaptain == true) ? 10 : 5;
 System.out.println(goldCoins); // 10

 // Employee Salary
 double mySalary = 26000;
 double taxDue = (mySalary >= 20000) ? (mySalary*0.35) : (mySalary*0.15);
 System.out.println(taxDue); // tax due = 26000*0.35 = 9100.0

 // Student Travel Allowance
 boolean isStudent = true;
 double distanceThreshold = 10.00; // miles
 double distanceToTravel = 2.03; // miles
 double travelAllowance = (isStudent == true) ? (distanceToTravel>distanceThreshold)? 20 : 10 : 0;
 // the above statement should be one line in your text editor.

 System.out.println(travelAllowance); // 10.0

 // At the pub
 boolean isSober = false;
 age = 18;
 String admit = (age >= 18) ? (isSober == true) ? "Enter" : "Sorry: not sober" :" Sorry: too young";
 // the above statement should be one line in your text editor.
 System.out.println(admit); // Sorry: not sober

 // At the ATM
float customerBalance = 300.45f;
float withdrawalRequest = 200.00f;
float maxCashWithdrawal = 200.00f;
String withdrawalOutcome = (withdrawalRequest > maxCashWithdrawal) ? "Max withdrawal is €200" : (withdrawalRequest > customerBalance) ? "Insufficient Funds" : "Take cash.";
// the above statement should be on one line in your text editor.
System.out.println(withdrawalOutcome); // Take cash
} // main
} // class
