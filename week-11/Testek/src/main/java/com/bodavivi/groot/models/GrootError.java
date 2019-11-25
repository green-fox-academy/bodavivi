package com.bodavivi.groot.models;

public class GrootError {

  String error;

  public GrootError() {
    this.error = "I am Groot!";
  }

  public GrootError(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
