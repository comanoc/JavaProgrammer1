package com.javadevelopers.code;

public class test{
  public static void main(String[] args){
    Calculator calc = new Calculator();
    calc.setNo1(2f);
    calc.setNo2(3f);
    calc.setOperator("+");
    System.out.println("2 + 3 = " + calc.performCalculation());

    calc.setOperator("-");
    System.out.println("2 - 3 = " + calc.performCalculation());

    calc.setOperator("*");
    System.out.println("2 * 3 = " + calc.performCalculation());

    calc.setOperator("/");
    System.out.println("2 / 3 = " + calc.performCalculation());

    calc.setOperator("%");
    System.out.println("2 % 3 = " + calc.performCalculation());

  }
}
