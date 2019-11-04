package com.bodavivi.greenfoxclub.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {
  private String name;
  private List<String> tricks = new ArrayList<>();
  private String food;
  private String drink;

  public Fox(String name, String food, String drink){
    this.name = name;
    this.food = food;
    this.drink = drink;
  }

  public void learnTrick(String trick){
    tricks.add(trick);
  }

  public Fox(){

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getTricks() {
    return tricks;
  }

  public void setTricks(List<String> tricks) {
    this.tricks = tricks;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }



}
