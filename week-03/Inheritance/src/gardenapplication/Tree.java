package gardenapplication;

import java.awt.*;

public class Tree extends Plant {

  public Tree(String color){
    super(color, 0, 10);

  }

  @Override
  public void watering(double liter){
    if (currentWater < minimumWater){
      currentWater += liter * 0.4;
    }
  }

}
