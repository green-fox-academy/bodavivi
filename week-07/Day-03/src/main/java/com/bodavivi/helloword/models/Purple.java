package com.bodavivi.helloword.models;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("purple")
public class Purple implements MyColor {
  @Override
  public void printColor() {
    System.out.println("It is a purple color.");
  }
}
