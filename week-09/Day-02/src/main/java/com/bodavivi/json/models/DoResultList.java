package com.bodavivi.json.models;

import java.util.List;

public class DoResultList {
  private List<Integer> result;

  public DoResultList(){

  }

  public DoResultList(List<Integer> result){
    this.result = result;
  }

  public List<Integer> getResult() {
    return result;
  }

  public void setResult(List<Integer> result) {
    this.result = result;
  }
}
