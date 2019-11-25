package com.bodavivi.groot.models;

public class GrootMessage {
  private String received;
  private String translated;

  public GrootMessage() {
  }

  public GrootMessage(String received) {
    this.received = received;
    this.translated = "I am Groot!";
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }
}
