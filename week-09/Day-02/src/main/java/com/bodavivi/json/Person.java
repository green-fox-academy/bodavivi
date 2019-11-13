package com.bodavivi.json;

import java.util.List;

public class Person {
  private int age;
  private String name;
  private boolean male;
  private List<String> hobbies;

  public Person(int age, String name, boolean male, List<String> hobbies){
    this.age = age;
    this.name = name;
    this.male = male;
    this.hobbies = hobbies;
  }
}
