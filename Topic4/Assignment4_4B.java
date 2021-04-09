import java.util.Arrays;

public class Assignment4_4B{
  public static void main(String[] args){
    int[] numbers = {34, 67, 23, 180};
    Arrays.sort(numbers);
    System.out.println(Arrays.binarySearch(numbers, 67));
  }
}
