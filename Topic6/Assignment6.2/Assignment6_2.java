public class Assignment6_2{
  public static void main(String[] args){
    Vegetable carrot = new Vegetable("Carrot", "Apiaceae");
    Vegetable pea = new Vegetable("Pea", "Legumes");
    Corn corn = new Corn("Corn", "Gramineae");

    Vegetable[] veg = {carrot, pea, corn};

    for(Vegetable v:veg){
      v.cook();
    }
  }
}
