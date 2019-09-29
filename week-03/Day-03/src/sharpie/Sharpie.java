package sharpie;

public class Sharpie {

  String color;
  float width;
  float inkAmount;

  Sharpie(String color, Float width) {
    this.color = color;
    this.width = width;
    this.inkAmount = 100;
  }

  public void use(){
    inkAmount-= 25;
  }
}
