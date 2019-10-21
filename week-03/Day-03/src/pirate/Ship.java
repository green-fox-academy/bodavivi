package pirate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
  List<Pirate> crew = new ArrayList<>();

  public Ship(){
  }

  public void fillShip(){
    Pirate jack = new Pirate();
    jack.getRumDrinkingCounter();
    Random random = new Random();
    int crewMembers = random.nextInt(50) + 10;

    for (int i = 0; i < crewMembers - 1; i++) {
      if (i == 0){
        crew.add(new Pirate("captain"));
      }else{
        crew.add(new Pirate());
      }
    }
  }
}
