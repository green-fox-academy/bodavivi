package aircraftcarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
  List<Aircraft> aircraftsStorer = new ArrayList<>();
  int storedAmmo;
  int healthpoints;

  public Carrier(int storedAmmo, int healthpoints){
    this.storedAmmo = storedAmmo;
    this.healthpoints = healthpoints;
  }

  public void add(Aircraft aircraft){
    aircraftsStorer.add(aircraft);
  }

  public void fill(){

    for (Aircraft aircraft : aircraftsStorer){
      aircraft.refill(storedAmmo);
      
    }
  }
}
