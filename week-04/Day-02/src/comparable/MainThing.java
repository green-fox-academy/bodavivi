package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainThing {
  public static void main(String[] args) {
    List<Thing> toDo = new ArrayList<>();

    Thing milk = new Thing("Get milk");
    Thing dog = new Thing("Walk the dog");
    Thing cat = new Thing("Fed the cat");
    Thing learn = new Thing("Learn some programming");

    toDo.add(milk);
    toDo.add(dog);
    toDo.add(cat);
    toDo.add(learn);

    dog.complete();
    cat.complete();

    Collections.sort(toDo);

    System.out.println(toDo);
  }
}
