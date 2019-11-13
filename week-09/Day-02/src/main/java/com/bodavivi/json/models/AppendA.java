package com.bodavivi.json.models;

public class AppendA {
  String appended;

  public AppendA(String appended){
    this.appended = appended + "a";
  }

  public AppendA(){

  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
