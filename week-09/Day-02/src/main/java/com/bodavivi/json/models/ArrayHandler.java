package com.bodavivi.json.models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayHandler {
  private String what;
  private List<Integer> numbers;

  public ArrayHandler(){

  }

  public ArrayHandler(String what, List<Integer> numbers){
    this.what = what;
    this.numbers = numbers;
  }

  public List<Integer> getNumbers() {
    return numbers;
  }

  public void setNumbers(List<Integer> numbers) {
    this.numbers = numbers;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }
}
