package com.bodavivi.json.models;

public class Num {
  int received;
  int result;

  public Num(){

  }

  public Num(int number){
    this.received = number;
    this.result = number * 2;
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
