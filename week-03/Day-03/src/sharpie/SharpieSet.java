package sharpie;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
  List<Sharpie> sharpies;

  SharpieSet(){
    sharpies = new ArrayList<>();
  }

  public void countUsable(){
    for (Sharpie pen : sharpies) {
      if (pen.inkAmount <=0){
        sharpies.remove(pen);
      }
    }
  }

  public void removeTrash(Sharpie pen){
    sharpies.remove(pen);
  }
}
