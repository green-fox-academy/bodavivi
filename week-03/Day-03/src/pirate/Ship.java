package pirate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
  List<Pirates> crew = new ArrayList<>();

  public Ship(){
  }

  public void fillShip(){
    Random random = new Random();
    int crewMembers = random.nextInt(50) + 10;

    for (int i = 0; i < crewMembers - 1; i++) {
      if (i == 0){
        crew.add(new Pirates("captain"));
      }else{
        crew.add(new Pirates());
      }
    }
  }
}
