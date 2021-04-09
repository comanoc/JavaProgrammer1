public class Assignment4_1B{
  public static void main(String[] args){
    byte y = 127;
    byte z = 1;
    z += y;

    String a = "Lucky Number: ";
    a+=z;
    a+=1;

    System.out.println(a);
  }
}

/*
The program will compile and will output:

  Lucky Number: -1281

Limit of byte is +127 so when we add 1 it wraps around to the
negative limit of -128. a+=z concatenates z to the end of the String.
Same with a+=1. 
*/
