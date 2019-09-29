package sharpie;

public class SharpieMain {
  public static void main(String[] args) {
    Sharpie sharpieOne = new Sharpie("purple", 50f);
    Sharpie sharpieTwo = new Sharpie("red", 30f);

    SharpieSet sharpieSet = new SharpieSet();

    sharpieSet.sharpies.add (sharpieOne);
    sharpieSet.sharpies.add (sharpieTwo);

    sharpieOne.use();
    sharpieOne.use();
    sharpieOne.use();
    sharpieOne.use();
    sharpieTwo.use();

    sharpieSet.countUsable();

    System.out.println(sharpieOne.inkAmount);

  }
}
