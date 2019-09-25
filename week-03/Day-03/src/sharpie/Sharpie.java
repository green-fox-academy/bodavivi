package sharpie;

public class Sharpie {

  String color;
  Float width;
  Float inkAmount = 100f;

  Sharpie(String color, Float width) {
    this.color = color;
    this.width = width;
  }

  public void use(){
    inkAmount-= 20;
  }
}
