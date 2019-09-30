package gardenapplication;

import java.awt.*;

public class Flower extends Plant{

  public Flower(String color){
    super(color, 0, 5);
  }

  @Override
  public void watering(double liter){
    if(currentWater < minimumWater){
      currentWater += liter * 0.75;
    }
  }
}
