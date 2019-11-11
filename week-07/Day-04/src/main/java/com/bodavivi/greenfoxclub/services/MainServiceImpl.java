package com.bodavivi.greenfoxclub.services;

import com.bodavivi.greenfoxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MainServiceImpl implements MainService {

  private Fox DEFAULT_FOX = new Fox();
  private List<Fox> FOXES = new ArrayList<>();
  private List<String> trickLibrary = new ArrayList<>(Arrays.asList("Do Spartan Race", "Programming in java", "Make pancakes", "Read a book", "Play Hearthstone"));

  @Override
  public List<String> getTrickLibrary() {
    return trickLibrary;
  }

  @Override
  public void addFox(Fox fox) {
    FOXES.add(fox);
  }

  @Override
  public Fox findFox(String name) {
    Fox result = DEFAULT_FOX;

    for (Fox fox : FOXES) {
      if (fox.getName().equals(name)) {
        result = fox;
      }
    }
    return result;
  }

  @Override
  public boolean alreadyExist(Fox foxToCheck){
    boolean exist = false;
    for(Fox fox : FOXES){
      if (fox.getName().equals(foxToCheck.getName())){
        exist = true;
      }
    }
    return exist;
  }


}
