package com.bodavivi.groot.models;

public class Cargo {
  private Integer caliber25;
  private Integer caliber30;
  private Integer caliber50;
  private String shipstatus;
  private Boolean ready;

  public Cargo() {
    this.caliber25 = 0;
    this.caliber30 = 0;
    this.caliber50 = 0;
    this.shipstatus="empty";
    this.ready = false;
  }

  public Integer getCaliber25() {
    return caliber25;
  }

  public void setCaliber25(Integer caliber25) {
    this.caliber25 = caliber25;
  }

  public Integer getCaliber30() {
    return caliber30;
  }

  public void setCaliber30(Integer caliber30) {
    this.caliber30 = caliber30;
  }

  public Integer getCaliber50() {
    return caliber50;
  }

  public void setCaliber50(Integer caliber50) {
    if ((caliber50 + this.caliber50 + this.caliber30 + this.caliber25) >= 12500){
      this.caliber50 += (12500 - this.caliber50 + this.caliber30 - this.caliber25);
    }else{
      this.caliber50 = caliber50;
    }

  }

  public String getShipstatus() {
    return shipstatus;
  }

  public void setShipstatus(String shipstatus) {
    int percent = (caliber25 + caliber30 +caliber50)/12500;
    this.shipstatus = percent + "%";
  }

  public Boolean getReady() {
    return ready;
  }

  public void setReady(Boolean ready) {
    this.ready = ready;
  }
}
