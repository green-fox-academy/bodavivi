package com.bodavivi.greenfoxclub.services;

import com.bodavivi.greenfoxclub.models.Fox;

import java.util.List;

public interface MainService {
  void addFox(Fox fox);
  Fox findFox(String name);
  boolean alreadyExist(Fox foxToCheck);
  List<String> getTrickLibrary();
}
