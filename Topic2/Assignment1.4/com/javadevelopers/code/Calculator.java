package com.javadevelopers.code;

public class Calculator{
  private float no1;
  private float no2;
  private String operator;

  public void setNo1(float num){
    this.no1 = num;
  }
  public void setNo2(float num){
    this.no2 = num;
  }
  public void setOperator(String operation){
    this.operator = operation;
  }

  public float getNo1(){
    return no1;
  }
  public float getNo2(){
    return no2;
  }
  public String getOperator(){
    return operator;
  }

  public float performCalculation(){
    if(operator.equals("+")){
      return no1 + no2;
    }
    else if(operator.equals("-")){
      return no1 - no2;
    }
    else if(operator.equals("*")){
      return no1 * no2;
    }
    else if(operator.equals("/")){
      return no1 / no2;
    }
    else if(operator.equals("%")){
      return no1 % no2;
    }
    else{
      return 0.0f;
    }
  }
}
