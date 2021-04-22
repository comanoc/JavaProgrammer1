public class Assignment7_1{
  public static void main(String[] args){
    int[] lottoNums = {23,12,10,16,30,32,20};
    System.out.println(lottoNums[7]);
  }
}

/*
Should we use a try catch block to catch the exception generated?
Ans: No we should not as we should never be in a situation where we try to access
a index that does not exist. (Would be different if we were taking user input)

Is the exception considered to be a checked or an unchecked exception?
Ans: Unchecked as the compiler doesn't force us to catch it.

*/ 
