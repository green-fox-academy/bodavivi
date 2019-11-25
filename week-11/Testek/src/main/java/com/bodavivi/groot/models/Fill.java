package com.bodavivi.groot.models;

public class Fill {
  String received;
  Integer amount;
  String shipstatus;
  Boolean ready;

  public Fill() {
  }

  public Fill(String received, Integer amount, String shipstatus, Boolean ready) {
    this.received = received;
    this.amount = amount;
    this.shipstatus = shipstatus;
    this.ready = ready;
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public String getShipstatus() {
    return shipstatus;
  }

  public void setShipstatus(String shipstatus) {
    this.shipstatus = shipstatus;
  }

  public Boolean getReady() {
    return ready;
  }

  public void setReady(Boolean ready) {
    this.ready = ready;
  }
}
