package com.bodavivi.json.models;

import java.util.List;

public class Entries {
  List<Log> entries;
  int entry_count;

  public Entries(){
  }

  public Entries(List<Log> entries){
    this.entries = entries;
    this.entry_count = entries.size();
  }

  public List<Log> getEntries() {
    return entries;
  }

  public void setEntries(List<Log> entries) {
    this.entries = entries;
  }

  public void addElement(Log log){
    entries.add(log);
  }

  public int getEntry_count() {
    return entry_count;
  }

  public void setEntry_count(int entry_count) {
    this.entry_count = entry_count;
  }
}
