public class PartF{
  public static void main(String[] args){
    Plum p1 = new Plum();
    Plum p2 = new Plum();
    Plum p3 = p1;

    if(p1 != p2)
      if(p1 == p3)
        System.out.println(true);
  }
}

class Plum{}
