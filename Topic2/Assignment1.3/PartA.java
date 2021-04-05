import java.util.Arrays;

public class PartA{
  public static void main(String[] args){
    int[] nums = {7,6,5,4,3,2,1};
    Arrays.sort(nums);
    for(int num:nums){
      System.out.print(num + " ");
    }
    System.out.println();
  }
}
