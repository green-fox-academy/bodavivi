package sharpie;

public class SharpieMain {
  public static void main(String[] args) {
    Sharpie pen = new Sharpie("purple", 50f);
    Sharpie anotherPen = new Sharpie("red", 30f);

    pen.use();
    anotherPen.use();
  }
}
