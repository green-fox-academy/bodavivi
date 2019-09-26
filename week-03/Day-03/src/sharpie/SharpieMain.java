package sharpie;

public class SharpieMain {
  public static void main(String[] args) {
    Sharpie pen = new Sharpie("purple", 50f);
    Sharpie anotherPen = new Sharpie("red", 30f);

    SharpieSet sharpieSet = new SharpieSet();

    sharpieSet.sharpies.add (pen);
    sharpieSet.sharpies.add (anotherPen);

    pen.use();
    pen.use();
    pen.use();
    pen.use();
    anotherPen.use();

    sharpieSet.countUsable();

    System.out.println(pen.inkAmount);

  }
}
