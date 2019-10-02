public class Sharpie {
  String color;
  float width;
  float inkAmount;

  public Sharpie(String color, float width){
    this.color = color;
    this.width = width;
    this.inkAmount = 100;
  }

  public void use(){
    inkAmount-= 20;
  }

  public float returnInkAmount(){
    return inkAmount;
  }

  public float returnWidth(){
    return width;
  }

  public String returnColor(){
    return color;
  }
}
