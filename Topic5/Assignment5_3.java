public class Assignment5_3{
  public void findMax(int... numbers){
    if(numbers.length >0){
      int max = numbers[0];
      for(int number:numbers){
        if(number > max){
          max = number;
        }
      }
      System.out.println("The max number is " + max);
    }else{
      // Empty array is passed
      System.out.println("You haven't entered any numbers!");
    }
  }
  public void findMax(){
    //Nothing is passed
    System.out.println("You haven't entered any numbers!");
  }
  public static void main(String[] args){
    new Assignment5_3().findMax(25,252,4,16,100);
    new Assignment5_3().findMax();
  }
}
