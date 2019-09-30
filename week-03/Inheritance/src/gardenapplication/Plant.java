package gardenapplication;

import java.awt.*;

public class Plant {
  String color;
  double currentWater;
  double minimumWater;

  public Plant(String color, double currentWater, double minimumWater){
    this.color = color;
    this.currentWater = 0;
    this.minimumWater = minimumWater;
  }

  public Plant(Color color, int currentWater){

  }

  public void watering(double liter){
  }


}
