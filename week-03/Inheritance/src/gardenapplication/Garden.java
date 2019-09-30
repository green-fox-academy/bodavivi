package gardenapplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plant> plantOfTheGarden = new ArrayList<>();

  public Garden(){


  }

  public void addFlower(Flower flower) {
    plantOfTheGarden.add(flower);
    if (flower.currentWater < flower.minimumWater){
      System.out.println("The " + flower.color + " " + flower.getClass().getSimpleName() + " needs water");
    }
  }

  public void addTree(Tree tree) {
    plantOfTheGarden.add(tree);
    if (tree.currentWater < tree.minimumWater){
      System.out.println("The " + tree.color + " " + tree.getClass().getSimpleName() + " needs water");
    }
  }

  public void watering() {
    double dontNeedWater = 0;
    double firstWatering = 40;
    double secondWatering = 70;


    for (Plant plant : plantOfTheGarden) {
      if (plant.currentWater >= plant.minimumWater) {
        dontNeedWater++;
      }
    }

    if (plantOfTheGarden.get(0).currentWater == 0){
      System.out.println("Watering with 40.");
      for (Plant plant : plantOfTheGarden){
        plant.watering(firstWatering/(plantOfTheGarden.size() - dontNeedWater));
        if (plant.currentWater >= plant.minimumWater){
          System.out.println("The " + plant.color + " " + plant.getClass().getSimpleName() + " doesn't need water.");
        }else{
          System.out.println("The " + plant.color + " " + plant.getClass().getSimpleName() + " needs water.");
        }
      }
    }else{
      System.out.println("Watering with 70.");
      for (Plant plant : plantOfTheGarden){
        plant.watering(secondWatering/(plantOfTheGarden.size() - dontNeedWater));
        if (plant.currentWater >= plant.minimumWater){
          System.out.println("The " + plant.color + " " + plant.getClass().getSimpleName() + " doesn't need water.");
        }else{
          System.out.println("The " + plant.color + " " + plant.getClass().getSimpleName() + " needs water.");
        }
      }
    }

  }
}
