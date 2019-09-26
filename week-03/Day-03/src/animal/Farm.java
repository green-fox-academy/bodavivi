package animal;

import org.junit.platform.commons.util.AnnotationUtils;

import java.util.ArrayList;
import java.util.List;

import static javax.swing.UIManager.get;

public class Farm {
  Animal[] animals;

  Farm(){
    this.animals = new Animal[5];
  }

  public void slaugter(){
    int c = 1000;
    Animal lessHungry;
    int lessHungryIndex = 0;
    for (int i = 0; i < animals.length; i++){
      if (animals[i].hunger < c){
        lessHungry = animals[i];
        c = animals[i].hunger;
        lessHungryIndex = i;
      }
    }
    animals[lessHungryIndex] = null;
  }

  public void breed(){
    for (int i = 0; i < animals.length; i++){
      if(animals[i] == null){
        Animal newie = new Animal();
      }
    }
  }
}
